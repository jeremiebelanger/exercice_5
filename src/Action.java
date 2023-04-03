import java.util.ArrayList;
import java.util.List;

public class Action extends ActionBase implements AggregateBase {

    private final List<Action> actionList = new ArrayList<>();

    private String nom;
    private double valeur;
    private double valeurInit;

    public Action(String nom, double valeurInit) {
        this.nom = nom;
        this.valeurInit = valeurInit;
        this.valeur = valeurInit;
    }

    @Override
    public IteratorActionBase createIterator() {
        return new ConcreteIterator(this);
    }
    public int count() {
        return actionList.size();
    }
    public void add(Action action) {
        actionList.add(action);
    }
    public Action get(int position) {
        return actionList.get(position);
    }

    public void setValeur(double nombre) {
        this.valeur = nombre;
        System.out.println("Changement de" + this.nom + " a " + nombre);
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
