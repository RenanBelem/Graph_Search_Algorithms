import java.util.ArrayList;

public class Pais {

    private ArrayList<Pais> fazFronteira;
    private String nome;
    private double latitude, longitude;

    public Pais(String nome, double lat, double lon){
        this.nome = nome;
        fazFronteira = new ArrayList<Pais>();
        latitude = lat;
        longitude = lon;
    }

    public String getNome(){
        return this.nome;
    }
    public ArrayList<Pais> getfazFronteira(){
        return this.fazFronteira;
    }

    public void addPais(Pais e){
        fazFronteira.add(e);
    }

    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }

}
