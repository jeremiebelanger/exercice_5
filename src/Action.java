import java.util.ArrayList;
import java.util.List;

public class Action extends ActionBase{

    private String nom;
    private double valeur;
    private double valeurInit;

    public Action(String nom, double valeurInit) {
        this.nom = nom;
        this.valeurInit = valeurInit;
        this.valeur = valeurInit;
    }

    public void setValeur(double nombre) {
        this.valeur = nombre;
        System.out.println("Changement de " + this.nom + " pour $" + nombre);
        notifier();
    }

    public String getNom(){
        return this.nom;
    }

    public double getValeurInit(){
        return this.valeurInit;
    }

    public double getValeur() {
        return this.valeur;
    }
}
