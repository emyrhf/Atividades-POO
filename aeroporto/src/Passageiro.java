package aeroporto.src;
//herança
public class Passageiro extends Pessoa {
    //associação
    private Aeronave aeronave;

    //3 características
    private int malas;
    public String destino;
    private String assento;

    //construtor
    public Passageiro(String nome, int cpf, int idade, int malas, Aeronave aeronave, String destino, String assento) {
        super(nome, cpf, idade);
        this.malas = malas;
        this.aeronave = aeronave;
        this.destino = destino;
        this.assento = assento;
    }

    //1 comportamento
    public void viajar(){
        System.out.println("O passageiro " + nome + " está viajando para " + destino + " e esta levando " + malas + " malas.");
    }

    @Override
    public void falar() {
        System.out.println("Olá, meu nome é " + nome + ". Sou passageiro e estou viajando para " + destino + ", no assento " + assento + ", na aeronave " + aeronave.modelo);
    }
    
}
