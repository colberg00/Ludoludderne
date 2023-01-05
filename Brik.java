public class Brik {
    protected String farve;
    protected int indeks;
    protected boolean status;


    public Brik(Player play, int t){
        this.farve = play.farve;
        this.indeks = t;
        this.status = false;
    }
}
