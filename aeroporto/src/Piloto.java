package aeroporto.src;
//herança
public class Piloto extends Pessoa {
    //associação
    private Aeronave aeronave;

    //3 características
    private int codANAC;
    private String companhiaAerea;
    private int horasVoo;

    //construtor
    public Piloto(String nome, int cpf, int idade, int codANAC, Aeronave aeronave, String companhiaAerea, int horasVoo) {
        super(nome, cpf, idade);
        this.codANAC = codANAC;
        this.companhiaAerea = companhiaAerea;
        this.horasVoo = horasVoo;
        this.aeronave = aeronave;
    }

    //1 comportamento
    public void pilotar(){
        System.out.println("O piloto " + nome + ", cujo código ANAC é " + codANAC + ", está pilotando a aeronave " + aeronave.modelo + " em uma viagem de " + horasVoo + " horas de voo.");
    }

    @Override
    public void falar() {
        System.out.println("Olá, meu nome é " + nome + ", sou piloto da companhia aérea " + companhiaAerea + " e estou pilotando a aeronave " + aeronave.modelo);
    }

}
