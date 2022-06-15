package courseDay5.exercise.Exercise2;

public class Patient {

    /*
    * Le but de cet exercice est de créer des « patients » qui ont un poids et une taille,et de calculer leur
    * « Indice de Masse Corporelle» (IMC).
    crée un patient,
    affiche les données du patient ainsi que son IMC.
    Avoir la possibilité de connaître la taille du patient, son poids
    *
    * */

    private String firstName;
    private String lastName;
    private int age;
    private double weight;
    private double size;

    public Patient(String firstName, String lastName, int age, double weight, double size) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.size = size;
        this.age = age;
    }

    public Patient(double weight, double size, int age) {
        this.weight = weight;
        this.size = size;
        this.age = age;

        this.firstName = "unspecified";
        this.lastName = "unspecified";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isValidAge() {
        return (this.age >= 18 && this.age <= 65);
    }

    public double computeIMC() {
        return this.weight / Math.pow(this.size, 2);
    }


    public String toString() {

        String returnString;
        if (isValidAge()){
            return String.format(
                            "\n========================" +
                            "\nFirst name: %s" +
                            "\nLast name: %s" +
                            "\nAge: %d" +
                            "\nWeight: %.2f" +
                            "\nHeight: %.2f" +
                            "\nIMC: %.2f\n" +
                            "========================\n",
                    this.firstName,
                    this.lastName,
                    this.age,
                    this.size,
                    this.weight,
                    computeIMC());
        } else {
            return String.format("Patient does not meet the age requirement for IMC calculation.");
        }
    }


}
