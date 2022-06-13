package courseDay3.exercise;

import java.util.Scanner;

public class Exercice20 {
    public static void main(String[] args) {
        /*
        Ecrire un programme java qui demande à l'utilisateur de remplir 
        une matrice carré 4 x 4 et qui 
        ensuite va calculer la somme des elements de la diagonale
        * */

        Scanner input = new Scanner(System.in);
        
        int[][] squareMatrix = new int[4][4];
        int diagonalSum = 0;

        for (int i = 0; i < squareMatrix.length; i++) {

            for (int j = 0; j < squareMatrix[i].length; j++) {
                System.out.printf("Row %d, column %d: ", i, j);
                int currentElement = input.nextInt();
                squareMatrix[i][j] = currentElement;
                if (i == j){
                    diagonalSum += currentElement;
                }
            }
        }

        System.out.printf("Sum of diagonal is %d", diagonalSum);
        
    }
}
