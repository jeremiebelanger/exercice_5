import java.util.List;

public class Portfeuille implements AggregateBase {
    private String nom;
    private int objectif;
    
    // peut etre le concreteaggregate
    private List<Integer> actions;
    private ProfilBase profil;

    public Portfeuille(String nom, int objectif, List<Integer> actions, ProfilBase profil) {
        this.nom = nom;
        this.objectif = objectif;
        this.actions = actions;
        this.profil = profil;
    }

    @Override
    public IteratorActionBase createIterator() {
        return null;
    }
}
