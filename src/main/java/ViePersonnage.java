public class ViePersonnage {
    private int ptVie;

    public ViePersonnage(){
        this.ptVie = 1000;
    }

    @Override
    public String toString() {
        return "ViePersonnage{" +
                "ptVie=" + ptVie +
                '}';
    }

    public void attaquer(){
        if (ptVie > 1) {
            ptVie = ptVie - 500;
        }
    }

    public void soigner(){
        if (ptVie > 1){
            ptVie = ptVie + 200;
        }
    }

    public void verificationVieLorsAttaque(){
        if (ptVie <= 0){
            System.out.println("Le personnage meurt");
            ptVie = 0;
        }
    }

    public void verificationVieLorsSoin(){
        if (ptVie >= 1000){
            ptVie = 1000;
        }
    }

    public void verificationSiPersonnageMortNePeutRecevoirDeSoin(){
        if(ptVie == 0){
            System.out.println("Le personnage ne peut recevoir de soin il est mort");
        }
    }


}
