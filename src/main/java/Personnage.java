public class Personnage {
    private String nom;
    private int ptVie;
    private int niveaux;
    private String etat;
    private int puissance = 60;
    private int soin = 50;

    public Personnage(String nom, int ptVie, int niveaux, String etat) {
        this.nom = nom;
        this.ptVie = ptVie;
        this.niveaux = niveaux;
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Nom=" + nom +
                ", Point de vie=" + ptVie +
                ", Niveaux=" + niveaux +
                ", Etat=" + etat;
    }

    public Personnage(){

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPtVie() {
        return ptVie;
    }

    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
    }

    public int getNiveaux() {
        return niveaux;
    }

    public void setNiveaux(int niveaux) {
        this.niveaux = niveaux;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void attaque (Personnage personnage){
        personnage.ptVie = this.ptVie - this.puissance;
        if (ptVie > 0){
            personnage.ptVie = this.ptVie - this.puissance;
        }
    }

    public void soigne(Personnage personnage){
        personnage.ptVie = this.ptVie + this.soin;
        if (ptVie < 101){
            personnage.ptVie = this.ptVie + this.soin;
        }
    }
}

