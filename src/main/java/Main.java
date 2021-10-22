public class Main {
    public static void main(String[] args) {
        Personnage personnage1 = new Personnage();
        System.out.println(personnage1.toString());

        personnage1.retraitVie();
        System.out.println("Le personnage se prend une attaque");
        System.out.println(personnage1);

        personnage1.recuperationVie();
        System.out.println("Le personnage se fait soigner");
        System.out.println(personnage1);

        personnage1.retraitVie();
        System.out.println("Le personnage se prend une attaque");
        System.out.println(personnage1);

        personnage1.retraitVie();
        System.out.println("Le personnage se prend une attaque");
        personnage1.verificationVieAttaque();
        personnage1.verificationVieSoin();
        personnage1.verificationSiPersonnageMortNePeutRecevoirDeSoin();
        System.out.println(personnage1);

    }
}
