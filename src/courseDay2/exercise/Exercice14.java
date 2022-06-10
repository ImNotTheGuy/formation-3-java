package courseDay2.exercise;

import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {
        /*
        A l'exercice précédent, s'ajoute un nouveau requirement:
        Le nombre de fois que l'utilisateur peut saisir des mauvais identifiants est limité à 5, ensuite le programme va s'arrêter avec un message disant.
        "Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué".
        Il faut dire à au user le nombre de tentatives restants*/

        Scanner input = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = input.next();

        System.out.print("Enter password: ");
        String password = input.next();


        System.out.println("Email and password defined\n\n\n\n\n");

        // define an int 'attempts'

        int attempts = 0;
        boolean loginValid;

        while (true) {

            System.out.print("Enter email: ");
            String emailInput = input.next();

            System.out.print("Enter password: ");
            String passwordInput = input.next();

            if (email.equals(emailInput) && password.equals(passwordInput)) {
                System.out.println("Login succesful.");
                loginValid = true;
                break;
            }
            if (5 - attempts == 0) {
                loginValid = false;
                break;
            } else if (5 - attempts == 1) {
                System.out.print("Login failed, please try again (last attempt)\n");
            } else {
                System.out.printf("Login failed, please try again (%d attempts remaining) \n", 5 - attempts);
            }

            attempts++;
        }

        if (loginValid) {
            System.out.println("User succesfully logged in. ");
        } else {
            System.out.println("Too many incorrect attempts. Computer will now explode.");
        }


    }
}
