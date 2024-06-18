package modele;

public class Station {

    private String nom;
    private int x, y;

    public Station(String nom, int x, int y) {
        this.nom = nom;
        this.x = x;
        this.y = y;
    }

    public double distance(Station t){
        double a = Math.pow(t.x - this.x, 2);
        double b = Math.pow(t.y - this.y,2);
        return Math.sqrt(a+b);
    }

    public String getNom() {
        return nom;
    }
}
