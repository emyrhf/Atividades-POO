package petshop.src;

public class Doenca {
    //5 características
    private String nome;
    private String sintomas;
    private String tratamento;
    private String gravidade;
    private boolean transmissivel;

    //associação
    private Animal animal;

    //construtor
    public Doenca(Animal animal, String nome, String sintomas, String tratamento, String gravidade, boolean transmissivel) {
        this.animal = animal;
        this.nome = nome;
        this.sintomas = sintomas;
        this.tratamento = tratamento;
        this.gravidade = gravidade;
        this.transmissivel = transmissivel;
    }

    //1 comportamento
    public void diagnosticar() {
        System.out.println(animal.nome + " tem " + nome + ", uma doença que apresenta os seguintes sintomas: " + sintomas + ".\n O tratamento recomendado é: " + tratamento + ".\n A gravidade da doença é: " + gravidade + ".\n Transmissível: " + transmissivel);
    }
}
