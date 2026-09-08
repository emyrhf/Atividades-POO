package aeroporto.src;
public class Pessoa {
    //3 características
    protected String nome;
    protected int cpf;
    protected int idade;

    //construtor
    public Pessoa(String nome, int cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    //1 comportamento
    public void falar(){
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos." + "e sou portador do CPF: " + cpf);
    }
}
