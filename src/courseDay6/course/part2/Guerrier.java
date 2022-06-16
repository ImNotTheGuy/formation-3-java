package courseDay6.course.part2;

public class Guerrier extends Personnage {

    String arme;

    public Guerrier(String name, int dureeVie, String arme) {
        super(name, dureeVie);
        this.arme = arme;
        System.out.println("Guerrier.Guerrier");
    }

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    @Override
    public void rencontrer() {
        System.out.println("Je suis un guerrier.");
    }

    @Override
    public String toString() {
        return "Guerrier{" +
                "arme='" + arme + '\'' +
                "} " + super.toString();
    }
}
