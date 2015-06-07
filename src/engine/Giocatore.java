package engine;

public class Giocatore {
    private String nome;
    private int eta;
    private int numeroMaglia;
    private boolean titolare;

    public Giocatore(String nome, int eta, int numeroMaglia, boolean titolare){
        this.nome = nome;
        this.eta = eta;
        this.numeroMaglia = numeroMaglia;
        this.titolare = titolare;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public int getNumeroMaglia() {
        return numeroMaglia;
    }

    public boolean isTitolare() {
        return titolare;
    }
    
    @Override
    public String toString(){
        return "Giocatore[ Nome: " +this.getNome() + ", Età: " + this.getEta() + ", Numero maglia: " + this.getNumeroMaglia() + ", Titolare: " + this.isTitolare() + "]";
    }
}