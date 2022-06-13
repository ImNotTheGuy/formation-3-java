package courseDay3.exercise;

import java.util.Scanner;

public class Exercice18 {
    public static void main(String[] args) {

        /*
        Ecrire un programme Java demande à l'utilisateur de saisir un text et qui ensuit, retourne la chaine inverse.
        Ex:
        Votre chaine : mamy
        Résultat : ymam
        * */

        Scanner input = new Scanner(System.in);

        System.out.printf("Give some text: ");
        String inputString = input.nextLine();
        String reverseString = "";

        for (int i = inputString.length()-1; i >= 0; i--) {
            reverseString += inputString.charAt(i);
        }

        System.out.println("Your text reversed is: " + reverseString);

    }
}
