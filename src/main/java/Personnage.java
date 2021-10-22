public class Personnage {

    ViePersonnage ptVie = new ViePersonnage();
    NiveauPersonnage niveau = new NiveauPersonnage();

    public Personnage() {
    }

    public void retraitVie(){
        ptVie.attaquer();
    }

    public void recuperationVie(){
        ptVie.soigner();
    }

    public void verificationVieAttaque(){
        ptVie.verificationVieLorsAttaque();
    }

    public void verificationVieSoin(){
        ptVie.verificationVieLorsSoin();
    }

    public void verificationSiPersonnageMortNePeutRecevoirDeSoin(){
        ptVie.verificationSiPersonnageMortNePeutRecevoirDeSoin();
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "pdv=" + ptVie +
                ", level=" + niveau +
                '}';
    }
}
