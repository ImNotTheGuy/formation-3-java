package courseDay1.exercise;

import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {

        /*Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche
        les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17,
        le programme affichera les nombres de 18 à 27.*/

        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int firstNumber = input.nextInt() + 1;

        for (int i = firstNumber; i < firstNumber + 10; i++) {
            System.out.println(i);
        }


    }
}
