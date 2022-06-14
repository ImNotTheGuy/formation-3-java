package courseDay3.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice22 {
    public static void main(String[] args) {

        /*
        *
        Ecrire un programme Java demande à l'utilisateur de saisir  liste de langages de
        programmations à partir du clavier.
        Une fois le tableau rempli, l'utilisateur sera appelé à saisir les noms des langages
        * qu'il souhaite retirer de liste.
        Le programme devra ensuite retirer ces langages et afficher l'état du tableau avant
        * et après la suppression.
        * */

        Scanner input = new Scanner(System.in);
        ArrayList<String> programmingLanguage = new ArrayList<>();

        String userInput;
        while (true){
            System.out.printf("Add a programming language (when finished enter empty char): ");
            userInput = input.nextLine();
            if (userInput == ""){
                break;
            }
            programmingLanguage.add(userInput);
        }

        var programmingBefore = programmingLanguage.clone();

        System.out.println("\nCurrent array: " + programmingLanguage + "\n");

        while (true){
            System.out.printf("Choose which element you wish to delete (when finished enter empty char): ");
            userInput = input.nextLine();
            if (userInput == ""){
                break;
            }
            programmingLanguage.remove(userInput);
        }

        System.out.println("Before deletion: " + programmingBefore);

        System.out.println("\nRemaining array: " + programmingLanguage);


    }
}
