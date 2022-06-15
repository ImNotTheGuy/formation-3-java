package courseDay5.exercise.Exercice1;

import javax.swing.*;

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

    String firstName;
    String lastName;
    String country;
    boolean married;
    int numberOfKids;

    public String fullName(){
        return firstName + " " + lastName;
    }





    public String fullDescription(){

        String tempStr = String.format("You are %s %s, living in %s, %s with %s kids",
                firstName,
                lastName,
                country,
                married?"married":"not married",
                numberOfKids);

        return tempStr;

    }

}
