package courseDay1.exercise;

import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        /*Ecrivez un programme Java qui lit un nombre et indique s'il est positif,
        négatif ou s'il vaut zéro et s'il est pair ou impair.
        Exemple d'exécution:
        Entrez un nombre entier: 5
        Le nombre est positif et impair
        Entrez un nombre entier: -4
        Le nombre est négatif et pair
        Entrez un nombre entier: 0
        Le nombre est zéro (et il est pair)*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();


        if (n == 0){
            System.out.println("Number is zero and even");
        } else {
            boolean isEven = (n % 2 == 0);
            boolean isPositive = (n > 0);

            String sign = isPositive ? "is positive" : "is negative";
            String evenOrOdd = isPositive ? "is even" : "is odd";

            System.out.printf("Your number %s and %s", sign, evenOrOdd);
        }

    }
}
