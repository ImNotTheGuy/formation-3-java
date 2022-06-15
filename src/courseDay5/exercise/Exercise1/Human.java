package courseDay5.exercise.Exercise1;

public class Human {

    /*
    * TP 1 POO:

    Ecrire une classe Personne qui est décrit par les données suivantes:
    firstName
    lastName
    pays
    married(booléen)
    nombreEnfants
    On doit avoir une méthode qui retourne un string nomComplet
    Dans le main, vous devez à partir du clavier demander à l'utilisateur de
    fournir toutes ces données et enfin les afficher dans main.
    * */

    private String firstName;
    private String lastName;
    private String country;
    private boolean married;
    private int numberOfKids;
    public Human(String firstName, String lastName, String country, boolean married, int numberOfKids) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.married = married;
        this.numberOfKids = numberOfKids;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }


    public String fullDescription() {

        String tempStr = String.format("You are %s %s, living in %s, %s with %s kids",
                firstName,
                lastName,
                country,
                married ? "married" : "not married",
                numberOfKids);

        return tempStr;

    }

}
