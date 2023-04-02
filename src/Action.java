public class Action extends ActionBase implements IteratorActionBase{

    private String nom;
    private double valeur;
    private double valeurInit;

    public Action(PortfeuilBase p) {
        this.nom = nom;
    }


    @Override
    public Object setValeur(double nombre) {
        this.valeur = nombre;
        if(valeurInit == 0){
            valeurInit = nombre;
        }
        notifier();
        //TODO
        return null;
    }

    @Override
    public Object incrementerValeur(double nombre) {
        return null;
    }

    @Override
    public double getValeur() {
        return this.valeur;
    }

    @Override
    public double getValeurInit() {
        return this.valeurInit;
    }

    @Override
    public Object valeurCourrante() {

    }


}
