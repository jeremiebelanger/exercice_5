public class Action extends ActionBase implements IteratorActionBase  {

    private final Portfeuille portfeuille;
    private double valeur;

    public Action(Portfeuille portfeuille, double valeur) {
        this.portfeuille = portfeuille;
        this.valeur = valeur;
    }


    @Override
    public void setValeur(double nombre) {
        this.valeur = nombre;
        notifier();
    }

    @Override
    public double getValeur() {
        return this.valeur;
    }
}
