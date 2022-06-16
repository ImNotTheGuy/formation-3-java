package courseDay6.course.part2;

import jdk.jfr.Timespan;
import jdk.jfr.Timestamp;

public abstract class Personnage {

    private String name;
    private int dureeVie;



    public Personnage(String name, int dureeVie) {
        System.out.println("Personnage.Personnage");
        this.name = name;
        this.dureeVie = dureeVie;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDureeVie() {
        return dureeVie;
    }

    public void setDureeVie(int dureeVie) {
        this.dureeVie = dureeVie;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "name='" + name + '\'' +
                ", dureeVie=" + dureeVie +
                '}';
    }

    public abstract void rencontrer();

}
