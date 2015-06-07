package engine;

import java.util.Vector;

public class Squadra {
    private String nome;
    private int ID;
    private int numeroGiocatori;
    private Vector<Giocatore> giocatori;
	
    public Squadra(String nome, int ID, int numeroGiocatori){
        this.nome = nome;
        this.ID = ID;
        this.numeroGiocatori = numeroGiocatori;
        this.giocatori =  new Vector<Giocatore>();
    }

    public String getNome() {
        return nome;
    }

    public int getID() {
        return ID;
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    public void addGiocatore(Giocatore g){
        getGiocatori().addElement(g);
    }
    
    public Vector<Giocatore> getGiocatori() {
        return giocatori;
    }
    
    @Override
    public String toString(){
        return "Squadra[ Nome: " +this.getNome() + ", ID: " + this.getID() + ", Numero giocatori: " + this.getNumeroGiocatori() + "]";
    }
    
    
}
