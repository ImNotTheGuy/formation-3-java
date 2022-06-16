package courseDay6.exercise.exercise3;

public class Main {
    public static void main(String[] args) {

        Voiture v1 = new Voiture(1994, 12000f);
        System.out.println(v1.getMatricule());

        Camion c1 = new Camion(1995, 24000);
        System.out.println(c1.getMatricule());

        c1.demarrer();
        c1.accelerer();

        v1.demarrer();
        v1.accelerer();

        System.out.println(v1);
        System.out.println(c1);

    }

}
