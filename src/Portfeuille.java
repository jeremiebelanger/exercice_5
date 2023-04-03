public class Portfeuille implements PortfeuilleBase{
    private Action actions;
    private String nom;
    private int objectif;
    private ProfilBase profil;

    public Portfeuille(String nom, int objectif, Action actions, ProfilBase profil) {
        this.nom = nom;
        this.objectif = objectif;
        this.profil = profil;
        this.actions = actions;
        actions.attach(this);
    }

    public Action getActions() {
        return actions;
    }

    public void setActions(Action actions) {
        this.actions = actions;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getObjectif() {
        return objectif;
    }

    public void setObjectif(int objectif) {
        this.objectif = objectif;
    }

    public ProfilBase getProfil() {
        return profil;
    }

    public void setProfil(ProfilBase profil) {
        this.profil = profil;
    }

    @Override
    public void update() {
        this.profil.verification(this);
    }

}
