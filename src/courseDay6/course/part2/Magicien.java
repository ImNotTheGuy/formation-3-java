package courseDay6.course.part2;

public class Magicien extends Personnage{

    public Magicien(String name, int dureeVie, String baguette) {
        super(name, dureeVie);
        this.baguette = baguette;
        System.out.println("Magicien.Magicien");
    }

    String baguette;

    public String getBaguette() {
        return baguette;
    }

    public void setBaguette(String baguette) {
        this.baguette = baguette;
    }

    @Override
    public void rencontrer() {
        System.out.println("Je suis un magicien.");
    }

    @Override
    public String toString() {
        return "Magicien{" +
                "baguette='" + baguette + '\'' +
                "} " + super.toString();
    }
}
