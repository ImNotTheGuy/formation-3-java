package courseDay2.exercise;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Exercice16 {
    public static void main(String[] args) {

        /*
        Ecrire un programme Java qui permet à l'utilisateur de déclarer 3 array d'entiers.
        Ces tableaux ne doivent pas forcément avoir la même taille
        Le programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,elementN] 
        et la somme de tous les éléments multiples 3 dans les 3 tableaux. 
        Ex :
        T1 : [ 2, 6, 8, 15,39,11 ]
        T2 : [ 21, 33, 12, 19,0 ]
        T3 : [ 17, 18, 46 ]
        
        S = 6+15+39+21+33+12+18 = 144
        * */

        Scanner input = new Scanner(System.in);
        System.out.printf("Length of table 1: ");
        int[] table1 = new int[input.nextInt()];
        System.out.printf("Length of table 2: ");
        int[] table2 = new int[input.nextInt()];
        System.out.printf("Length of table 3: ");
        int[] table3 = new int[input.nextInt()];


        int totalMultipleOfThree = 0;
        String multipleOfThreeString = "";

        for (int i = 0; i < table1.length; i++) {
            System.out.printf("Value of element %d in table 1: ", i);
            int temp_val = input.nextInt();
            if (temp_val % 3 == 0){
                totalMultipleOfThree += temp_val;
                multipleOfThreeString += " + " + temp_val;
            }
            table1[i] = temp_val;
        }

        for (int i = 0; i < table2.length; i++) {
            System.out.printf("Value of element %d in table 2: ", i);
            int temp_val = input.nextInt();
            if (temp_val % 3 == 0){
                totalMultipleOfThree += temp_val;
                multipleOfThreeString += " + " + temp_val;
            }
            table2[i] = temp_val;
        }

        for (int i = 0; i < table3.length; i++) {
            System.out.printf("Value of element %d in table 3: ", i);
            int temp_val = input.nextInt();
            if (temp_val % 3 == 0){
                totalMultipleOfThree += temp_val;
                multipleOfThreeString += " + " + temp_val;
            }
            table3[i] = temp_val;
        }

        System.out.println("Total multiples of 3: " + totalMultipleOfThree);
        System.out.println("Values: " + multipleOfThreeString);



//        arr[0] = ;


        


    }
}
