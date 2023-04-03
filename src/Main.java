import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Action actions = new Action("Action A",10.00);
        actions.add(actions);
        actions.add(actions);
        actions.add(actions);
        actions.add(actions);

        ProfilBase profil1 = new ProfilDepend();

        Portfeuille portfeuille = new Portfeuille("Portfeuille 1",300,actions,profil1);

        actions.setValeur(5.0);



    }
}