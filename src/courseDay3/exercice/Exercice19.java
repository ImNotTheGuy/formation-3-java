package courseDay3.exercice;

import java.util.Scanner;

public class Exercice19 {
    public static void main(String[] args) {

        /*
        Ecrire un programme Java demande à l'utilisateur de saisir un text et qui ensuit, renseigne si celui est un palindrome(mot qui se lit de la même dans les 2 sens).
        Ex :
        Entrez un text : non
        Résultat : non est un palindrome
        Entrez un text : oui
        Résultat : oui n'est pas un palindrome
        * */

        Scanner input = new Scanner(System.in);

        System.out.printf("Give some text: ");
        String inputString = input.nextLine();
        String reverseString = "";

        for (int i = inputString.length()-1; i >= 0; i--) {
            reverseString += inputString.charAt(i);
        }

        if (reverseString.equals(inputString)){
            System.out.println("Yes, this is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}
