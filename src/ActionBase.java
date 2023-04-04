import java.util.ArrayList;
import java.util.List;

/**
 * Class abstarite qui permet d'avertir tous les actions qu'il a eux un changement.
 *
 * @author Jérémie Bélanger et Simon Lamarche Perrea
 */
public abstract class ActionBase {
    /**
     * List permettant se stocker tous les actions dans une liste.
     */
    private final List<PortefeuilleBase> portfeuilleBases = new ArrayList<>();

    /**
     * Permet d'attacher les action à la liste
     *
     * @param p un portefeuille de base.
     */
    public void attach(PortefeuilleBase p) {
        portfeuilleBases.add(p);
    }

    /**
     * Permet de detacher les action de la liste.
     *
     * @param p un portefeuille de base.
     */
    public void detach(PortefeuilleBase p) {
        portfeuilleBases.remove(p);
    }

    /**
     * Methode permettant d'avertir les action qu'il y a un changement.
     */
    public void notifier() {
        for (int i = 0 ; i < portfeuilleBases.size(); i++) {
            portfeuilleBases.get(i).update();
        }
    }
}
