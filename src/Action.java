/**
 * Classe qui créer les actions
 *
 * @author Jérémie Bélanger et Simon Lamarche Perrea
 */
public class Action extends ActionBase{

    /**
     * Le nom de l'action.
     */
    private String nom;

    /**
     * La valeur de l'action
     */
    private double valeur;
    /**
     * Permet d'avoir en tous temps la valeur initatial de l'action
     */
    private double ancienneValeur;

    /**
     * Le constructeur
     * @param nom le nom de l'action.
     * @param valeurInit la valeur de base de l'action
     */
    public Action(String nom, double valeurInit) {
        this.nom = nom;
        this.ancienneValeur = valeurInit;
        this.valeur = valeurInit;
    }

    /**
     * Permet d'initialiser et de changer la valeur.
     * @param nombre la nouvelle valeur de l'action.
     */
    public void setValeur(double nombre) {
        this.ancienneValeur = this.valeur;
        System.out.println("Changement de prix pour " + this.nom + " : $" + this.valeur + " ---> $" + nombre);
        this.valeur = nombre;
        notifier();
    }

    /**
     * Prend le nom de l'action.
     * @return le nom de l'action.
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Prend la valeur initial de l'action.
     * @return la valeur initial de l'action.
     */
    public double getAncienneValeur(){
        return this.ancienneValeur;
    }

    /**
     * Prend la valeur de l'action.
     * @return la valeur actuelle de l'action.
     */
    public double getValeur() {
        return this.valeur;
    }
}
