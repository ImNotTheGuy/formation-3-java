package courseDay6.course.part2Inheritance;

public class Main {

    public static void main(String[] args) {

        Guerrier guerrier = new Guerrier("Christian", 100, "JAVA-47");
        Voleur voleur = new Voleur("voleur", 100, "couteau");
        Magicien magicien = new Magicien("magicien", 100, "bleComplet");
        Sorcier sorcier = new Sorcier("sorcier", 100, "baguette magique", "Baton magique");

        System.out.printf("\n\n");

        guerrier.rencontrer();
        voleur.rencontrer();
        magicien.rencontrer();
        sorcier.rencontrer();

        System.out.printf("\n\n");

        System.out.println(guerrier);
        System.out.println(voleur);
        System.out.println(magicien);
        System.out.println(sorcier);









    }

}
