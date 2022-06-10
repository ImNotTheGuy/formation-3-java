package courseDay2.exercise;

import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {

        /*
        * Ecrire un programme Javascript qui permet à l'utilisateur de définir une adresse email et un mot de passe.

        Ensuite dans un second temps, il sera demandé à l'utilisateur de fournir l'email et le mot de passe:

        Si l'email et le mot de passe ne correspondent pas aux valeurs définies, le message "Identifiants incorrect devra s'afficher", et l'utilisateur devra recommencer la saisie des valeurs.

        Sinon, le message "Bienvenu dans votre espace client" devra s'afficher.
        * */

        // enter mail and password

        Scanner input = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = input.next();

        System.out.print("Enter password: ");
        String password = input.next();


        System.out.println("\n------ Email and password defined ------\n");

        while (true){

            // Enter login info

            System.out.print("Enter email: ");
            String emailInput = input.next();

            System.out.print("Enter password: ");
            String passwordInput = input.next();

            // If the login info corresponds to the defined email and password, break out of the loop
            // If not keep the loop running.

            if ( email.equals(emailInput) && password.equals(passwordInput) ){
                System.out.println("Login succesful.");
                break;
            }

            System.out.println("Login failed, please try again.");
        }


    }
}
