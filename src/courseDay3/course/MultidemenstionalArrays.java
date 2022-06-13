package courseDay3.course;

import java.util.Arrays;

public class MultidemenstionalArrays {
    public static void main(String[] args) {

        // To declare and initialize a multidimensionalArray, use:
        int[][] threeArray = {{1, 2, 3}, {3, 4, 5}, {6, 6}};

        // To declare a multidemensionalArray, you can use new int[3][]
        // where '3' will be the number of arrays
        int[][] multiArray = new int[3][];

        // add elements to first array
        multiArray[0] = new int[]{1, 2, 3, 4, 5};

        int[] someArray = {1, 2, 3};
        // other method, by declaring the array first
        multiArray[1] = someArray;

        // to loop through a n-array:
        for (int i = 0; i < threeArray.length; i++) {
            for (int j = 0; j < threeArray[i].length; j++) {
                System.out.printf("Element %d of array %d is %d\n", j, i, threeArray[i][j]);

            }
        }

    }
}
