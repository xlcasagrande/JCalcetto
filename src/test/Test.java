package test;
import engine.*;

public class Test {

    public static void main(String[] args) {
        
        Torneo torneo = new Torneo(4);
        Squadra squadra1 = new Squadra("squadra1", 1, 5);
        Squadra squadra2 = new Squadra("squadra2", 2, 5);
        Squadra squadra3 = new Squadra("squadra3", 3, 5);
        Squadra squadra4 = new Squadra("squadra4", 4, 5);
        torneo.addSquadra(squadra1);
        torneo.addSquadra(squadra2);
        torneo.addSquadra(squadra3);
        torneo.addSquadra(squadra4);
        torneo.randomize();
        
        Giocatore[] giocatori = new Giocatore[20];
        for(int i=0; i<giocatori.length; i++){
            giocatori[i] = new Giocatore("Giocatore", 25, i, true);
        }
        
        for(int i=0; i<giocatori.length; i=i+4){
            squadra1.addGiocatore(giocatori[i]);
            squadra2.addGiocatore(giocatori[i+1]);
            squadra3.addGiocatore(giocatori[i+2]);
            squadra4.addGiocatore(giocatori[i+3]);
        }
        
        for(Partita p: torneo.getPartite()){
            p.setGoalPrimaSquadra((int) (Math.random() * 10));
            p.setGoalSecondaSquadra((int) (Math.random() * 10));
        }
        
        for(Squadra s: torneo.getSquadre()){
            System.out.println(s);
            for(Giocatore g: s.getGiocatori()){
                System.out.println(g);
            }
        }
        
        for(Partita p: torneo.getPartite()){
            System.out.println(p);
        }
    }
    
}
