import java.util.ArrayList;

public class GrafoH {
    private ArrayList<Pais> pais;
    public GrafoH(){
        pais = new ArrayList<Pais>();
    }
    public void add(Pais e){
        pais.add(e);
    }

    public Pais getPais(String nome){
        for(Pais e : pais){
            if(e.getNome().equals(nome)) return e;
        }
        return null;
    }
}
