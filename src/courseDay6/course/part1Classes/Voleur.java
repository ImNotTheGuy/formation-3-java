package courseDay6.course.part1Classes;

public class Voleur {

    private String nom;
    private int dureeDeVie;
    private String arme;

    public Voleur(String nom, int dureeDeVie, String arme) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
        this.arme = arme;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    @Override
    public String toString() {
        return "Voleur{" +
                "nom='" + nom + '\'' +
                ", dureeDeVie=" + dureeDeVie +
                ", arme='" + arme + '\'' +
                '}';
    }

    public void rencontrer() {
        System.out.println("Je suis un voleur");
    }

    public void voler() {
        System.out.println("Cache bien ton tel");
    }
}
