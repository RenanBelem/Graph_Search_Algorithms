import java.util.ArrayList;

public class BHeuristica {
    private static ArrayList<Pais> visited;
    private static boolean pass = false;

    public static double h(Pais x, Pais fim){

        double distanciaLatitude = ( x.getLatitude() - fim.getLatitude() ),
                distanciaLongitude = ( x.getLongitude() - fim.getLongitude() );
        double distancia = Math.sqrt(distanciaLatitude * distanciaLatitude +
                distanciaLongitude * distanciaLongitude);
        return distancia;

    }

    public static double g(Pais x, Pais inicio){  return h(x, inicio);  }

    private static Pais distanciaMaisBaixa(ArrayList<Pais> pais, Pais goal){
        double maisBaixo = Double.MAX_VALUE;
        Pais hold = null;

        for(int i = 0; i < pais.size(); i++){
            double h_i = h(pais.get(i), goal);
            if(!visited.contains(pais.get(i)) && (h_i < maisBaixo)){
                maisBaixo = h_i;
                hold = pais.get(i);
            }
        }
        return hold;
    }

    private static double media(double a, double b){  return (a+b)/2; }

    private static Pais distanciaMaisBaixa_g_h(ArrayList<Pais> pais, Pais inicio, Pais fim){

        double maisBaixo_h = Double.MAX_VALUE, maisBaixo_g = Double.MAX_VALUE;
        Pais hold = null;

        for(int i = 0; i < pais.size(); i++){
            double h_i = h(pais.get(i), fim), g_i = g(pais.get(i), inicio);
            if(!visited.contains(pais.get(i)) && (media(g_i, h_i) < media(maisBaixo_g, maisBaixo_h))){
                maisBaixo_g = g_i;
                maisBaixo_h = h_i;
                hold = pais.get(i);
            }
        }
        return hold;
    }

    // Busca Gulosa.
    private static void busca(GrafoH g, String estadoInicio, String estadoFim){
        ArrayList<Pais> paises = g.getPais(estadoInicio).getfazFronteira();
        for(int i = 0; i < paises.size(); i++){
            Pais pais = distanciaMaisBaixa(paises, g.getPais(estadoFim));
            if (pass || pais == null) { break; }
            if (pais.getNome().equals(estadoFim)){
                visited.add(pais);
                pass = true;
            }
            else if(!visited.contains(pais)){
                visited.add(pais);
                busca(g, pais.getNome(), estadoFim);
            }
        }
    }


    // Busca A*.
    private static void busca_a(GrafoH g, String estadoInicio, String estadoFim){
        ArrayList<Pais> paises = g.getPais(estadoInicio).getfazFronteira();

        for(int i = 0; i < paises.size(); i++){
            Pais pais = distanciaMaisBaixa_g_h(paises, g.getPais(estadoInicio), g.getPais(estadoFim));

            if (pass || pais == null) { break; }
            if (pais.getNome().equals(estadoFim)){
                visited.add(pais);
                pass = true;
            }
            else if(!visited.contains(pais)){
                visited.add(pais);
                busca_a(g, pais.getNome(), estadoFim);
            }
        }
    }




    // Retorna visitados como string.
    private static String stringfy(){
        String ret = " ";
        for(int i = 0; i < visited.size(); i++){
            ret += visited.get(i).getNome();
            if(i < visited.size()-1){ ret += " -> "; }
        }
        return ret+" ";
    }



    public static String buscaGulosa(GrafoH g, String paisInicio, String paisFim){
        pass = false;
        visited = new ArrayList<>();
        visited.add(g.getPais(paisInicio));
        busca(g,paisInicio,paisFim);
        if (stringfy().contains(" "+paisFim+" ")){
            return stringfy();
        }
        return "País "+paisFim+ " não foi encontrado!\n\tCaminhos: "+stringfy();
    }

    public static String A_estrela(GrafoH g, String paisInicio, String paisFim){
        pass = false;
        visited = new ArrayList<>();
        visited.add(g.getPais(paisInicio));
        busca_a(g,paisInicio,paisFim);
        if (stringfy().contains(" "+paisFim+" ")){
            return stringfy();
        }
        return "País "+paisFim+ " não foi encontrado!\n\tCaminhos: "+stringfy();
    }
}