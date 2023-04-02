import java.util.ArrayList;
import java.util.List;

public abstract class ActionBase {
    private final List<ProfilBaseObserveur> profils = new ArrayList<>();

    public void attach(ProfilBaseObserveur p){
        profils.add(p);
    }

    public void detach(ProfilBaseObserveur p){
        profils.remove(p);
    }

    public void notifier() {
        for (ProfilBaseObserveur profilBaseObserveur : profils){
            profilBaseObserveur.update();
        }
    }
}
