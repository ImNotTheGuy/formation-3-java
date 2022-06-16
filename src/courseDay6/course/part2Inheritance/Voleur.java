package courseDay6.course.part2Inheritance;

public class Voleur extends Guerrier{

    public Voleur(String name, int dureeVie, String arme) {
        super(name, dureeVie, arme);
        System.out.println("Voleur.Voleur");
    }

    @Override
    public void rencontrer() {
        System.out.println("Je suis un voleur.");
    }

    public void voler() {
        System.out.println("Fais gaffe à ton tel");
    }

    @Override
    public String toString() {
        return "Voleur{" +
                "arme='" + arme + '\'' +
                "} " + super.toString();
    }
}
