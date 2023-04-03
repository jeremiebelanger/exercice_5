import java.util.ArrayList;
import java.util.List;

/**
 * Class qui créer les portefeuilles.
 *
 * @author Jérémie Bélanger et Simon Lamarche Perrea
 */
public class Portfeuille implements PortfeuilleBase{

    private List<Action> actions = new ArrayList<>();

    private String nom;
    private double objectif;

    private ProfilBase profil;
    private double valeurInit = 0;

    /**
     * Constructeur du poretfeuille.
     * @param nom le nom du portefeuille.
     * @param objectif l'objectif à atteindre du portefeuille.
     * @param actions les actions que détiens le portefeuille.
     * @param profil le style de profil du portefeuille.
     */
    public Portfeuille(String nom, double objectif, List<Action> actions, ProfilBase profil) {
        this.nom = nom;
        this.objectif = objectif;
        this.profil = profil;
        this.actions = actions;
        for (Action action : actions){
            action.attach(this);
            this.valeurInit += action.getValeur();
        }
        update();
    }

    /**
     * Prend le nom du portefeuille.
     * @return le nom du portefeuille.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Prend la liste d'action d'un portefeuille
     * @return les actions d'un portfeuille.
     */
    public List<Action> getActions() {
        return actions;
    }

    /**
     * Prend l'objectif du portefeuille.
     * @return l'objectif du portefeuille.
     */
    public double getObjectif() {
        return objectif;
    }

    /**
     * Methode qui écrit en console ce qui se passe quand un portefeuille est vendu.
     */
    public void vendre(){
        System.out.println("Vente d'actions du portefeuille " + this.nom +
                "\n Valeur initiale : $" + this.valeurInit +
                "\n Valeur actuelle : $" + getValeurPortfeuille() +
                "\n Objectif : $" + this.objectif +
                "\n Profit : $" + (getValeurPortfeuille() - valeurInit));
    }

    /**
     * Methode qui permet d'updater les portefeuilles lors d'un changement.
     */
    @Override
    public void update() {
        this.profil.verification(this);
    }

    /**
     * Permet de prendre la valeur initiale d'un action
     * @return la valeur initial d'un action
     */
    public double getValeurInit() {
        return this.valeurInit;
    }

    /**
     * Prend le profile assigner a un portefeuille
     * @return le profile assigner.
     */
    public ProfilBase getProfil() {
        return profil;
    }

    /**
     * Prend la valeur total d'un portefeuille.
     * @return la valeur total d'un portefeuille.
     */
    public double getValeurPortfeuille(){
        double montant = 0;
        for ( Action action : actions){
            montant += action.getValeur();
        }
        return montant;
    }

}
