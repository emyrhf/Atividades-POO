package edu.nobreza;

public class Principe extends Nobre implements Cavaleiro{
    public Principe(String nome){
        super(nome);
    }

    @Override 
    public void governar(){
        System.out.println("Sou o Principe " + nome + " e governo o reino de Fedora.");
        super.governar();
    }

    @Override 
    public void duelar(){
    System.out.println("Eu sou o Principe " + nome + " e sei duelar.");
    }
}
