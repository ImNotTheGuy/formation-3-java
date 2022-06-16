package courseDay6.course.part1Classes;

public class Sorcier {

    private String nom;
    private int dureeDeVie;
    private String baguette;
    private String batonMagique;
    public Sorcier(String nom, int dureeDeVie, String baguette, String batonMagique) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
        this.baguette = baguette;
        this.batonMagique = batonMagique;
    }

    @Override
    public String toString() {
        return "Sorcier{" +
                "nom='" + nom + '\'' +
                ", dureeDeVie=" + dureeDeVie +
                ", baguette='" + baguette + '\'' +
                ", batonMagique='" + batonMagique + '\'' +
                '}';
    }

    public String nom() {
        return nom;
    }

    public Sorcier setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public int dureeDeVie() {
        return dureeDeVie;
    }

    public Sorcier setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
        return this;
    }

    public String baguette() {
        return baguette;
    }

    public Sorcier setBaguette(String baguette) {
        this.baguette = baguette;
        return this;
    }

    public String batonMagique() {
        return batonMagique;
    }

    public Sorcier setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
        return this;
    }

    public void rencontrer() {
        System.out.println("You're a wizard Harry");
    }
}
