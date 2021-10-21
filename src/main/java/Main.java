public class Main {
    public static void main(String[] args) {
        Personnage personne1 = new Personnage("Pierre", 1000, 1, "Vivant");
        Personnage personne2 = new Personnage("Paul", 1000, 1, "Vivant");
        Personnage personne3 = new Personnage("Jacques", 1000, 1, "Mort");


        System.out.println("Personnage 1 : " + personne1.toString());
        System.out.println("Personnage 2 : " + personne2.toString());
        System.out.println("Personnage 3 : " + personne3.toString());

    }
}
