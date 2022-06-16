package courseDay6.course.part2Inheritance;

public class Sorcier extends Magicien{

    public Sorcier(String name, int dureeVie, String baguette, String batonMagique) {
        super(name, dureeVie, baguette);
        this.batonMagique = batonMagique;
        System.out.println("Sorcier.Sorcier");
    }

    String batonMagique;

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }

    @Override
    public void rencontrer() {
        System.out.println("Je suis un sorcier.");
    }

    @Override
    public String toString() {
        return "Sorcier{" +
                "batonMagique='" + batonMagique + '\'' +
                ", baguette='" + baguette + '\'' +
                "} " + super.toString();
    }

}
