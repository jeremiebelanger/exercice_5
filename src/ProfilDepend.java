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
    public Boolean conditionObjectif(Portefeuille portfeuille) {
        int nbFois = 0;
        boolean contrat = false;
        for(Action action : portfeuille.getActions()){
            if(action.getAncienneValeur() - action.getValeur() > 5 && action.getAncienneValeur() > action.getValeur()){
                nbFois++;
            }
        }
        if((nbFois * 100 / portfeuille.getActions().size()) >= 50 ){
            contrat = true;
        }
        if(portfeuille.getValeurPortfeuille() < portfeuille.getValeurInitPortefeuille()){
            System.out.println("Aveeeeeee MAAAAARIIIIIIEEEEEEEE");
        }

        return contrat ;
    }
}
