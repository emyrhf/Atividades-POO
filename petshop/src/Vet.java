package petshop.src;
//herança
public class Vet extends Pessoa {
    //5 características
    private int crmv;
    private String turno;
    private String especialidade;
    private String clinica;
    private String registro;

    //Associação
    private Animal animal;

    //construtor
    public Vet(Animal animal, String nome, String cpf, int telefone, int idade, String email, int crmv, String turno, String especialidade, String clinica, String registro) {
        super(nome, cpf, telefone, idade, email);
        this.animal = animal;
        this.crmv = crmv;
        this.turno = turno;
        this.especialidade = especialidade;
        this.clinica = clinica;
        this.registro = registro;
    }

    //2 comportamentos
    public void examinarAnimal() {
        System.out.println("O veterinário " + nome + ", portador do CRMV " + crmv + ", está examinando " + animal.nome + " na clínica " + clinica + ".");
    }

    public void dadosVet(){
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nIdade: " + idade + "\nEmail: " + email + "\nCRMV: " + crmv + "\nTurno: " + turno + "\nEspecialidade: " + especialidade + "\nClínica: " + clinica + "\nRegistro: " + registro);
    }
}
