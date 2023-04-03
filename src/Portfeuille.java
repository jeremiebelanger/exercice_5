import java.util.ArrayList;
import java.util.List;

public class Portfeuille implements PortfeuilleBase{

    private List<Action> actions = new ArrayList<>();

    private String nom;
    private double objectif;

    private ProfilBase profil;
    private double valeurInit = 0;

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

    public String getNom() {
        return nom;
    }

    public List<Action> getActions() {
        return actions;
    }
    public double getObjectif() {
        return objectif;
    }

    public void vendre(){
        System.out.println("Vente d'actions du portefeuille " + this.nom +
                "\n Valeur initiale : $" + this.valeurInit +
                "\n Valeur actuelle : $" + getValeurPortfeuille() +
                "\n Objectif : $" + this.objectif +
                "\n Profit : $" + (getValeurPortfeuille() - valeurInit));
    }

    @Override
    public void update() {
        this.profil.verification(this);
    }

    public double getValeurInit() {
        return this.valeurInit;
    }

    public ProfilBase getProfil() {
        return profil;
    }

    public double getValeurPortfeuille(){
        double montant = 0;
        for ( Action action : actions){
            montant += action.getValeur();
        }
        return montant;
    }

}
