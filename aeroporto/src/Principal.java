package aeroporto.src;

public class Principal {
    public static void main(String[] args) {
        //instanciando 2 aeronaves
        Aeronave aeronave1 = new Aeronave(150, "Boeing 737", 900.0);
        Aeronave aeronave2 = new Aeronave(200, "Airbus A320", 1200.0);

        //instanciando 2 aeroportos
        Aeroporto aeroporto1 = new Aeroporto("Pista 1", "Portão A", "São Paulo", aeronave1);
        Aeroporto aeroporto2 = new Aeroporto("Pista 2", "Portão B", "Rio de Janeiro", aeronave2);

        //instanciando 2 passageiros
        Passageiro passageiro1 = new Passageiro("João", 123456789, 30, 2, aeronave1, "Rio de Janeiro", "12A");
        Passageiro passageiro2 = new Passageiro("Maria", 987654321, 25, 1, aeronave2, "São Paulo", "15B");

        //instanciando 2 pilotos
        Piloto piloto1 = new Piloto("Carlos", 111222333, 40, 12345, aeronave1, "Gol", 5);
        Piloto piloto2 = new Piloto("Ana", 444555666, 35, 67890, aeronave2, "Latam", 4);

        //chamando os métodos
        aeroporto1.liberarPista();
        aeroporto1.anunciarVoo();
        aeronave1.decolar();
        aeronave1.pousar();
        passageiro1.viajar();
        passageiro1.falar();
        piloto1.pilotar();

        aeroporto2.liberarPista();
        aeroporto2.anunciarVoo();
        aeronave2.decolar();
        passageiro2.viajar();
        passageiro2.falar();
        piloto2.pilotar();
    }
}
