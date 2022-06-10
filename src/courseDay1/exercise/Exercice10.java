package courseDay1.exercise;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {

        /*Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.
        Votre programme devra produire la sortie suivante à l'écran :

        Tables de multiplication

        Table de 2 :
        1 * 2 = 2
        ...
        10 * 2 = 20

        Table de 5 :
        1 * 5 = 5
        2 * 5 = 10
        ...
        Table de 10 :
        1 * 10 = 10 …*/

        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        int n1 = input.nextInt();

        System.out.print("Second number: ");
        int n2 = input.nextInt();

        int endNumber = Math.max(n1, n2);
        int firstNumber = Math.min(n1, n2);

        for (int i = firstNumber; i <= endNumber; i++) {
            System.out.printf("================= \nTable de %d:\n================= \n", i);
            for (int j = 2; j <= 10; j++) {

                int result = i * j;
                System.out.printf("%d x %d = %d\n", i, j, result);

            }

        }



    }
}
