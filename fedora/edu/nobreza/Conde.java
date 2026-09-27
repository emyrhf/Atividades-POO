package edu.nobreza;

public class Conde extends Nobre{
    public Conde(String nome){
        super(nome);
    }

    @Override 
    public void governar(){
        System.out.println("Sou o Conde " + nome + " e governo o reino de Fedora.");
        super.governar();
    }
}
