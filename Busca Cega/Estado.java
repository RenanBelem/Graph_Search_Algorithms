import java.util.ArrayList;

public class Estado {

    private ArrayList<Estado> fazFronteira;
    private String nome;

    public Estado(String nome){
        this.nome = nome;
        fazFronteira = new ArrayList<Estado>();
    }

    public String getNome(){
        return this.nome;
    }

    public ArrayList<Estado> getfazFronteira(){
        return this.fazFronteira;
    }

    public void addEstado(Estado e){
        fazFronteira.add(e);
    }

}
