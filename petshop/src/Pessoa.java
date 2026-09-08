package petshop.src;

public class Pessoa {
    //5 características
    protected String nome;
    protected String cpf;
    protected int telefone;
    protected int idade;
    protected String email;

    //construtor
    public Pessoa(String nome, String cpf, int telefone, int idade, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.email = email;
    }

    //1 comportamento
    public void informar(){
        System.out.println("Eu sou " + nome + ", tenho " + idade + " anos.");
    }
}
