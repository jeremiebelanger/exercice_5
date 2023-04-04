/**
 * Class pour créer un profil peureux.
 *
 * @author Jérémie Bélanger et Simon Lamarche Perrea
 */
public class ProfilPeureux extends ProfilBase{
    /**
     * Les condition applicable au profile peureux.
     * @param portfeuille les portefeuilles.
     * @return la réponse si une des condition est remplis.
     */
    @Override
    public Boolean conditionObjectif(Portefeuille portfeuille) {
        for (Action action : portfeuille.getActions()){
            if(action.getValeur() < action.getAncienneValeur()){
                if(portfeuille.getValeurPortfeuille() < portfeuille.getValeurInitPortefeuille()){
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
                    return  true;
                }
            }
        }
        return false ;
    }
}
