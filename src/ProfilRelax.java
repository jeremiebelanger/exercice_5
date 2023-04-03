import java.util.List;
/**
 * Class pour créer un profil relax.
 *
 * @author Jérémie Bélanger et Simon Lamarche Perrea
 */
public class ProfilRelax extends ProfilBase{
    /**
     * Les condition applicable au profile relax.
     * @param portfeuille les portefeuilles.
     * @return la réponse si une des condition est remplis.
     */
    @Override
    public Boolean conditionObjectif(Portfeuille portfeuille) {
        boolean contrat = false;
        if(portfeuille.getValeurPortfeuille() < portfeuille.getValeurInit()){
            contrat = true;
        }
        return contrat ;
    }
}
