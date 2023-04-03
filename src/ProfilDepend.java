import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Class pour créer un profil dépend.
 *
 * @author Jérémie Bélanger et Simon Lamarche Perrea
 */
public class ProfilDepend extends ProfilBase{

    /**
     * Les condition applicable au profile Détend.
     * @param portfeuille les portefeuilles.
     * @return la réponse si une des condition est remplis.
     */
    @Override
    public Boolean conditionObjectif(Portfeuille portfeuille) {
        double montant = 0;
        boolean contrat = false;
        for(Action action : portfeuille.getActions()){
            if(action.getValeur() - action.getValeurInit() <= 5){
                montant += action.getValeur();
            }
        }
        if(montant >= (portfeuille.getValeurPortfeuille() / 2)){
            contrat = true;
        }
        if(portfeuille.getValeurPortfeuille() < portfeuille.getValeurInit()){
            System.out.println("Attentio tu va mourrir (Dans le monde de la finance) \n");
        }

        return contrat ;
    }
}
