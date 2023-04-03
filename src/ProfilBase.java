import java.util.List;

/**
 * Class abstraite qui est la base de ce qu'est un profile.
 *
 * @author Jérémie Bélanger et Simon Lamarche Perrea
 */
public abstract class ProfilBase {
    /**
     * Methode qui permet de vérifier quand on dois alerter l'utilsateur
     * et quand on doit vendre le portefeuille.
     * @param portfeuille les portefeuille.
     */
    public final void verification(Portfeuille portfeuille) {
        System.out.println("################### \n" +
                "Évaluation du portefeuille : " + portfeuille.getNom() + " avec profil : " +  portfeuille.getProfil().getClass().getName() +
                "\n Résultat:");
        if (conditionObjectif(portfeuille)){
            System.out.println("objectif atteint");
                portfeuille.vendre();
        }
        if (portfeuille.getObjectif() <= portfeuille.getValeurPortfeuille()) {
            portfeuille.vendre();
        }
        System.out.println("On laisse ça comme ça.");
        System.out.println("################### \n");
    }

    /**
     * Methode permettant de créer des condition spécifique a certain profile.
     * @param portfeuille les portefeuilles.
     * @return la réponse de la condition ajouter.
     */
    public  abstract Boolean conditionObjectif(Portfeuille portfeuille);

}
