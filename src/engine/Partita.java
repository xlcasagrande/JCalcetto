package engine;

public class Partita {
    private Squadra primaSquadra;
    private Squadra secondaSquadra;
    private int goalPrimaSquadra;
    private int goalSecondaSquadra;

    public Partita(Squadra primaSquadra, Squadra secondaSquadra){
        this.primaSquadra = primaSquadra;
        this.secondaSquadra = secondaSquadra;		
    }

    public Squadra getPrimaSquadra() {
        return primaSquadra;
    }

    public Squadra getSecondaSquadra() {
        return secondaSquadra;
    }

    public int getGoalPrimaSquadra() {
        return goalPrimaSquadra;
    }

    public int getGoalSecondaSquadra() {
        return goalSecondaSquadra;
    }

    public void setGoalPrimaSquadra(int goalPrimaSquadra) {
        this.goalPrimaSquadra = goalPrimaSquadra;
    }

    public void setGoalSecondaSquadra(int goalSecondaSquadra) {
        this.goalSecondaSquadra = goalSecondaSquadra;
    }
    
    public Squadra getVincitore(){
        Squadra value = null;
        if(goalPrimaSquadra > goalSecondaSquadra){
            value = primaSquadra;
        }else{
            value = secondaSquadra;
        }
        return value;
    }

    public Squadra getPerdente(){
        Squadra value = null;
        if(goalPrimaSquadra > goalSecondaSquadra){
            value = secondaSquadra;
        }else{
            value = primaSquadra;
        }
        return value;
    }
    
    @Override
    public String toString(){
        return "Partita[ Prima squadra: " +this.getPrimaSquadra() + ", Seconda squadra: " + this.getSecondaSquadra() + ", Goal prima squadra: " + this.getGoalPrimaSquadra() + ", Goal seconda squadra: " + this.getGoalSecondaSquadra() + "]";
        
    }
}
