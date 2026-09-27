package edu.nobreza;
import java.util.List;

public class Nobre{
    protected String nome;
    protected Conselheiro conselheiro;
    protected List<Soldado> soldados;
    
    public Nobre(String nome){
        this.nome = nome;
    }

    public void governar(){
        System.out.println("Sou um nobre e governo o reino de Fedora.");
    }
}