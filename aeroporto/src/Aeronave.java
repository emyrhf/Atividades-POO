package aeroporto.src;
public class Aeronave{
    //3 características
    private int assentos;
    public String modelo;
    private double velocidadeMaxima;

    //construtor
    public Aeronave(int assentos, String modelo, double velocidadeMaxima) {
        this.assentos = assentos;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //2 comportamentos
    public void decolar(){
        System.out.println("A aeronave " + modelo + " está decolando e atingindo a velocidade máxima de " + velocidadeMaxima + " km/h!");
    }

    public void pousar(){
        System.out.println("A aeronave " + modelo + " com " + assentos + " assentos, está pousando!");
    }

}