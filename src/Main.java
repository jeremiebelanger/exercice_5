import java.util.ArrayList;
import java.util.List;

/**
 * La class main
 */
public class Main {

    /**
     * La fonction main ou les test sont effectués.
     * @param args les argument our exe.
     */
    public static void main(String[] args) {

        /* Le test 1 */
        System.out.println("Exemple 1");
        List<Action> actionList1 = new ArrayList<>();
        Action actionA = new Action("Action A", 10.00);
        Action actionB = new Action("Action B",15.00 );
        Action actionC = new Action("Action C",20.00 );
        actionList1.add(actionA);
        actionList1.add(actionA);
        actionList1.add(actionA);
        actionList1.add(actionA);
        actionList1.add(actionA);

        ProfilBase profilPeureux = new ProfilPeureux();

        Portefeuille portfeuille1 = new Portefeuille("Portefeuille 1",200.00,actionList1,profilPeureux);

        actionA.setValeur(20.00);

        actionA.setValeur(50.00);

        actionA.setValeur(10.00);

        /* Le test 2 */
        System.out.println(" \n Exemple 2");

        Portefeuille portfeuille2 = new Portefeuille("Portefeuille 2",200.00,actionList1,profilPeureux);

        actionA.setValeur(5.00);
        actionA.setValeur(10.00);

        /* Le test 3 */
        System.out.println(" \n Exemple 3");
        List<Action> actionList2 = new ArrayList<>();
        actionList2.add(actionA);
        actionList2.add(actionA);
        actionList2.add(actionA);
        actionList2.add(actionA);
        actionList2.add(actionA);
        actionList2.add(actionB);
        actionList2.add(actionB);
        actionList2.add(actionB);
        actionList2.add(actionB);
        actionList2.add(actionB);
        actionList2.add(actionC);
        actionList2.add(actionC);
        actionList2.add(actionC);
        actionList2.add(actionC);
        actionList2.add(actionC);


        Portefeuille portfeuille3 = new Portefeuille("Portefeuille 3",200.00,actionList2,profilPeureux);

        actionA.setValeur(5.00);
        actionA.setValeur(10.00);

        /* Le test 4 */
        System.out.println(" \n Exemple 4");

        ProfilBase profilRelax = new ProfilRelax();

        Portefeuille portfeuille4 = new Portefeuille("Portefeuille 4",500.00,actionList2);

        portfeuille4.setProfil(profilRelax);

        actionA.setValeur(5.00);

        portfeuille4.setProfil(profilPeureux);

        actionA.setValeur(6.00);
        actionA.setValeur(5.00);
        actionA.setValeur(10.00);

        /* Le test 5 */
        System.out.println(" \n Exemple 5");

        List<Action> actionList3 = new ArrayList<>();
        actionList3.add(actionA);
        actionList3.add(actionA);
        actionList3.add(actionA);
        actionList3.add(actionA);
        actionList3.add(actionA);
        actionList3.add(actionB);
        actionList3.add(actionB);
        actionList3.add(actionB);
        actionList3.add(actionB);
        actionList3.add(actionB);
        for(int i = 0; i < 15; i++){
            actionList3.add(actionC);
        }


        ProfilBase profilDepend = new ProfilDepend();

        Portefeuille portfeuille5 = new Portefeuille("Portefeuille 5",500.00,actionList3);
        Portefeuille portfeuille6 = new Portefeuille("Portefeuille 6",300.00,actionList2,profilPeureux);

        portfeuille5.setProfil(profilDepend);
        actionA.setValeur(5.00);
        actionC.setValeur(5.00);



    }
}