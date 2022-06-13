package courseDay3.exercice;

import java.util.Scanner;

public class Exercice21 {
    public static void main(String[] args) {
        // A partir du TP précédent, ajouter le calcul de la somme de 2 diagonales

        Scanner input = new Scanner(System.in);

        int[][] squareMatrix = new int[][] {
            {1,2,3,4},
            {2,4,6,8},
            {4,8,8,8},
            {13,22,21,22},
        };

        int diagonalSum1 = 0;
        int diagonalSum2 = 0;

        for (int i = 0; i < squareMatrix.length; i++) {

            for (int j = 0; j < squareMatrix[i].length; j++) {
//                System.out.printf("Row %d, column %d: ", i+1, j+1);
                int currentElement = squareMatrix[i][j];
//                squareMatrix[i][j] = currentElement;
                if (i == j){
                    diagonalSum1 += currentElement;
                } else if (i + j == 3){
                    diagonalSum2 += currentElement;
                }
            }
        }

        System.out.printf("Sum of diagonal 1 is %d\nSum of diagonal 2 is %d", diagonalSum1, diagonalSum2);
    }
}
