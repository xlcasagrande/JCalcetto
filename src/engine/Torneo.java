package engine;

import java.util.Vector;

import java.util.Collections;

public class Torneo {
    private int numeroSquadre;
    private Vector<Squadra> squadre;
    private Vector<Partita> partite;

    public Torneo(int numeroSquadre){
        this.numeroSquadre = numeroSquadre;
        this.squadre = new Vector<Squadra>();
        this.partite = new Vector<Partita>();
    }

    public int getNumeroSquadre() {
        return numeroSquadre;
    }

    public void addSquadra(Squadra s){
        getSquadre().addElement(s);
    }

    public void randomize(){
        Collections.shuffle(getSquadre());
        for(int i=0; i<getSquadre().size(); i=i+2){
            Partita p1 = new Partita(getSquadre().elementAt(i), getSquadre().elementAt(i+1));
            addPartita(p1);
        }
    }

    public void addPartita(Partita p){
        getPartite().addElement(p);
    }

    public Vector<Partita> getPartite() {
        return partite;
    }

    public Vector<Squadra> getSquadre() {
        return squadre;
    }
}
