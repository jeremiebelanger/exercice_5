import java.util.List;

public abstract class ProfilBase {
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

    public  abstract Boolean conditionObjectif(Portfeuille portfeuille);

}
