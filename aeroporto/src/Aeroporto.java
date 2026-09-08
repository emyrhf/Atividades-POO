package aeroporto.src;
public class Aeroporto {
    //3 características
    private String pista;
    private String portao;
    private String cidade;

    //associação
    private Aeronave aeronave;

    //construtor
    public Aeroporto(String pista, String portao, String cidade, Aeronave aeronave) {
        this.pista = pista;
        this.portao = portao;
        this.cidade = cidade;
        this.aeronave = aeronave;
    }

    //2 comportamentos
    public void liberarPista(){
        System.out.println("A " + pista + " do aeroporto da cidade de " + cidade + " está liberada para pouso e decolagem!");
    }

    public void anunciarVoo(){
        System.out.println("O avião " + aeronave.modelo + " está pronto para embarque no portão " + portao + "!");
    }
}
