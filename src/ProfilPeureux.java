import java.util.List;

public class ProfilPeureux extends ProfilBase{
    @Override
    public Boolean conditionObjectif(Portfeuille portfeuille) {

        boolean contrat = false;
        if(portfeuille.getValeurPortfeuille() < portfeuille.getValeurInit()){
            contrat = true;
        }
        return contrat ;
    }
}
