public abstract class ProfilBase {
    public final void verification(Portfeuille portfeuille) {
        if (conditionObjectif(portfeuille.getObjectif(),portfeuille.getActions())){
            System.out.println("objectif atteind");
            vendre();
        }
    }

    public  abstract Boolean conditionObjectif(int objectif , Action actions);
    public abstract void  vendre();

}
