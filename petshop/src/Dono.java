package petshop.src;

public class Dono extends Pessoa {
    //5 características
    private String endereco;
    private String ocupacao;
    private String convenioVeterinario;
    private int idConsulta;
    private double valorConsulta;

    //Associação
    private Animal animal;

    //construtor
    public Dono(Animal animal, String nome, String cpf, int telefone, int idade, String email, String endereco, String ocupacao, String convenioVeterinario, int idConsulta, double valorConsulta) {
        super(nome, cpf, telefone, idade, email);
        this.animal = animal;
        this.endereco = endereco;
        this.ocupacao = ocupacao;
        this.convenioVeterinario = convenioVeterinario;
        this.idConsulta = idConsulta;
        this.valorConsulta = valorConsulta;
    }

    //2 comportamentos
    public void alimentarAnimal() {
        System.out.println(nome + " está alimentando seu animal " + animal.nome + ".");
    }

    public void dadosDono(){
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nIdade: " + idade + "\nEmail: " + email + "\nEndereço: " + endereco + "\nOcupação: " + ocupacao + "\nConvênio Veterinário: " + convenioVeterinario + "\nID da Consulta: " + idConsulta + "\nValor da Consulta: R$" + valorConsulta);
    }
}
