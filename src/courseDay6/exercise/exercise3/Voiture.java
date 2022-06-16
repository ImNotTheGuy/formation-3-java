package courseDay6.exercise.exercise3;

public class Voiture extends Vehicules {

    public Voiture(int anneeModele, float prix) {
        super(anneeModele, prix);
    }

    @Override
    void demarrer() {
        System.out.println("Voiture demarre.");
    }

    @Override
    void accelerer() {
        System.out.println("Voiture accelere.");
    }

}
