public class Main {
    public static void main(String[] args) {
        Personnage personne1 = new Personnage("Pierre", 100, 1, "Vivant");
        Personnage personne2 = new Personnage("Paul", 100, 1, "Vivant");

        System.out.println("Personnage 1 : " + personne1.toString());
        System.out.println("Personnage 2 : " + personne2.toString());

        personne1.attaque(personne2);
        System.out.println(personne2.toString());
        personne1.soigne(personne2);
        System.out.println(personne2.toString());
    }
}
