import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exemple 1");
        List<Action> actionList = new ArrayList<>();
        Action actionA =  new Action("Action A", 10.00);
        actionList.add(actionA);
        actionList.add(actionA);
        actionList.add(actionA);
        actionList.add(actionA);
        actionList.add(actionA);

        actionA.setValeur(20.00);
        ProfilBase profilPeureux = new ProfilPeureux();

        Portfeuille portfeuille = new Portfeuille("Portefeuille 1",200.00,actionList,profilPeureux);

        actionA.setValeur(50.00);

    }
}