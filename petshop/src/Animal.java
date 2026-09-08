package petshop.src;
public class Animal {
    //5 características
    public String nome;
    private String especie;
    private double peso;
    private int idade;
    private double altura;

    //construtor
    public Animal(String nome, String especie, double peso, int idade, double altura) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
    }

    //2 comportamentos
    public void emitirSom() {
        System.out.println( nome + ", animal da espécie " + especie + ", está emitindo um som.");
    }

    public void dadosAnimal(){
        System.out.println("Nome: " + nome + "\nEspécie: " + especie + "\nPeso: " + peso + " kg" + "\nIdade: " + idade + " anos" + "\nAltura: " + altura + " m");
    }
}
