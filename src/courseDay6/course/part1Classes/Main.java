package courseDay6.course.part1Classes;

public class Main {
    public static void main(String[] args) {

        Voleur voleur = new Voleur("voleur", 100, "couteau");
        Sorcier sorcier = new Sorcier("sorcier", 100, "ble complet", "batonMagique");
        Magicien magicien = new Magicien("magicien", 100, "farine T65");
        Guerrier guerrier = new Guerrier("guerrier", 100, "AK-47");

        System.out.println(voleur);
        System.out.println(sorcier);
        System.out.println(magicien);
        System.out.println(guerrier);

        System.out.println();
        System.out.println();
        System.out.println();

        voleur.rencontrer();
        voleur.voler();
        sorcier.rencontrer();
        magicien.rencontrer();
        guerrier.rencontrer();

    }
}