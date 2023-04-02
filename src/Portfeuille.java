import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Portfeuille implements AggregateBase, PortfeuilBase {
    private List<Action> actions ;
    private String nom;
    private int objectif;
    private ProfilBase profil;

    public Portfeuille(String nom, int objectif,List<Action> actions , ProfilBase profil) {
        this.nom = nom;
        this.objectif = objectif;
        this.profil = profil;
        this.actions = actions;
    }

    @Override
    public IteratorActionBase createIterator() {
        return new Action(this);
    }

    @Override
    public void update() {
        profil.verification(this.objectif, this.actions);
    }
}
