package petshop.src;

public class Principal {
    public static void main(String[] args) {
        // Criando 2 animais
        Animal animal1 = new Animal("Rex", "cachorro", 20.5, 5, 0.6);
        Animal animal2 = new Animal("Mia", "gato", 10.0, 3, 0.5);

        // Criando duas doenças
        Doenca doenca1 = new Doenca(animal1, "raiva", "febre, agressividade", "vacinação", "alta", true);
        Doenca doenca2 = new Doenca(animal2, "gripe", "tosse, coriza", "repouso e hidratação", "média", false);

        // Criando dois veterinários
        Vet vet1 = new Vet(animal1, "Renata", "12345678900", 999999999, 40, "silva@email.com", 12345, "manhã", "clínico Geral", "pet", "REG001");
        Vet vet2 = new Vet(animal2, "Cesar", "09876543210", 888888888, 35, "souza@email.com", 67890, "tarde", "cirurgião", "pet", "REG002");

        // Criando dois donos
        Dono dono1 = new Dono(animal1, "João", "11122233344", 777777777, 30, "joao@email.com", "Rua Azul, 89", "engenheiro", "PetLovers", 1, 100.0);
        Dono dono2 = new Dono(animal2, "Maria", "44455566677", 666666666, 25, "maria@email.com", "Rua Vermelho, 541", "professora", "MyPet", 2, 150.0);

        // Comportamentos
        dono1.informar();
        dono2.dadosDono();
        dono2.alimentarAnimal();
        doenca1.diagnosticar();
        doenca2.diagnosticar();
        vet1.examinarAnimal();
        vet1.dadosVet();
        vet2.examinarAnimal();
        animal1.emitirSom();
        animal1.dadosAnimal();
        animal2.emitirSom();
    }
}
