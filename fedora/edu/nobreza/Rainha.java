package edu.nobreza;
public class Rainha extends Nobre implements Diplomata{
    public Rainha(String nome){
        super(nome);
    }

    @Override
    public void governar() {
        System.out.println("Sou a Rainha" + nome + " e governo o reino de Fedora.");
        super.governar();
    }

    @Override 
    public void fazerDiplomacia(){
        System.out.println("Eu sou a Rainha " + nome + " e sei fazer diplomacia.");
    }
}
