
import java.util.ArrayList;

public class BProfundidade {

    private static ArrayList<Estado> visited;
    private static boolean pass = false;

    private static void busca(Grafo grafo, String estadoComeco, String estadoFinal, int profundidade, int counter){

        ArrayList<Estado> estados = grafo.getEstado(estadoComeco).getfazFronteira();

        if (profundidade == 0 ){ pass = true; }

        for(int i = 0; i < estados.size(); i++){

            Estado estado = estados.get(i);

            if (pass){ break; }

            if (estado.getNome().equals(estadoFinal)){
                visited.add(estado);
                pass = true;
            }
            else if(counter+1 == profundidade){
                if(!visited.contains(estado)){  visited.add(estado); }
                continue;
            }
            else if(!visited.contains(estado)){
                visited.add(estado);
                busca(grafo, estado.getNome(), estadoFinal, profundidade, counter+1);
            }
            else{
                busca(grafo, estado.getNome(), estadoFinal, profundidade, counter+1);
            }
        }
    }

    private static void busca_b(Grafo g, String estadoInicio, String estadoFim){

        ArrayList<Estado> estados = g.getEstado(estadoInicio).getfazFronteira();

        for(int i = 0; i < estados.size(); i++){

            Estado estado = estados.get(i);

            if (pass) { break; }

            if (estado.getNome().equals(estadoFim)){

                visited.add(estado);

                pass = true;

            }
            else if(!visited.contains(estado)){

                visited.add(estado);

                busca_b(g, estado.getNome(), estadoFim);

            }

        }

    }

    private static String stringfy(){

        String ret = " ";
        for(int i = 0; i < visited.size(); i++){

            ret += visited.get(i).getNome();

            if(i < visited.size()-1){ ret += " -> "; }

        }

        return ret+" ";

    }


    public static String buscaProfundidade(Grafo g, String estadoComeco, String estadoFinal){

        pass = false;

        visited = new ArrayList<>();

        visited.add(g.getEstado(estadoComeco));

        busca_b(g,estadoComeco,estadoFinal);

        if (stringfy().contains(" "+estadoFinal+" ")){
            return stringfy();
        }

        return "Estado "+estadoFinal+ " não foi encontrado!\n\tCaminhos: "+stringfy();

    }


    public static String buscaAprofundamentoIterado(Grafo g, String estadoComeco, String estadoFinal){

        int profundidade = 1;

        do{

            pass = false;

            visited = new ArrayList<>();

            visited.add(g.getEstado(estadoComeco));

            busca(g,estadoComeco,estadoFinal, profundidade-1, 0);

            if (stringfy().contains(" "+estadoFinal+" ")){
                break;
            }

            profundidade++;

        }while (true);

        return "\nEstado "+estadoFinal+" encontrado na interação "+profundidade+".\n"+stringfy()+"\n";

    }


}
