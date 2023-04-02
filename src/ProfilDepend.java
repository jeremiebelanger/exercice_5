import java.util.List;

public class ProfilDepend extends ProfilBase{


    @Override
    public Boolean conditionObjectif(int objectif, List<Action> actions) {
        if(actions.get(0).getValeur() - actions.get(0).getValeurInit() > 5){
            for (Action action : actions){

            }
        }
    }
}
