public class ProfilDepend extends ProfilBase{


    @Override
    public Boolean conditionObjectif(int objectif, Action actions) {
        double montant = 0;
        if(actions.getValeur() - actions.getValeurInit() <= 5){
            IteratorActionBase iterator = actions.createIterator();
            Action action = (Action) iterator.first();
            while(!iterator.isDone()){
                if()
                montant += action.getValeur();
                action = (Action) iterator.next();
            }
        }

        return false;
    }

    @Override
    public void vendre() {

    }
}
