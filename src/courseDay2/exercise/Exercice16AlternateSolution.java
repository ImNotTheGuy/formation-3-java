package courseDay2.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice16AlternateSolution {
    public static void main(String[] args) {
        
        // These constants can be used to put color in terminal 😊

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        Scanner input = new Scanner(System.in);

        // User specifies number of tables
        System.out.print("Desired number of arrays: ");
        int nTables = input.nextInt();
        int[][] arrays = new int[nTables][];

        for (int i = 0; i < nTables; i++) {
            // User specifies number elements in given array
            System.out.printf("Number of elements in array %s: ", i+1);
            int nElements = input.nextInt();

            // Create an array of nElements
            int[] array = new int[nElements];

            for (int j = 0; j < nElements; j++) {
                // User specifies element in given array
                System.out.printf("Element %s in array %s: ", j+1, i+1);
                int element = input.nextInt();
                array[j] = element;
            }
            arrays[i] = array;

        }

        List<Integer> divisibleByThree = new ArrayList<>();
        int currentElement;
        int sumOfDivisibleByThree = 0;

        for (int i = 0; i < nTables; i++) {
            System.out.printf("Table %s: ", i+1);
            for (int j = 0; j < arrays[i].length; j++) {
                currentElement = arrays[i][j];
                if (currentElement % 3 == 0){
                    System.out.print(ANSI_YELLOW + " " + currentElement + ANSI_RESET);
                    divisibleByThree.add(currentElement);
                    sumOfDivisibleByThree += currentElement;
                } else {
                    System.out.print(" "+ currentElement);
                }
            }
            System.out.println();
        }

        System.out.printf("All elements divisible by 3: " + ANSI_YELLOW + "%s" + ANSI_RESET, divisibleByThree.toString());

        System.out.printf("\nfor which the total sum is: " + ANSI_YELLOW + "%s", sumOfDivisibleByThree);


    }



}
