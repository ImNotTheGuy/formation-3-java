package courseDay6.exercise.exercise3;

public class Camion extends Vehicules {

    public Camion(int anneeModele, float prix) {
        super(anneeModele, prix);
    }

    @Override
    void demarrer() {
        System.out.println("Camion demarre.");
    }

    @Override
    void accelerer() {
        System.out.println("Camion accelere.");
    }


    // this can be accessed without instantiating the class
    public static void klaxon(){
        System.out.println("Honk honk motherfuckers");
    }

}
