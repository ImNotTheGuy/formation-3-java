package courseDay4.course;

import java.util.ArrayList;

public class SumOfArrays {
    public static void main(String[] args) {

        float sum = 0;
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {7, 8, 9, 10, 11, 12};
        int[] array3 = {13, 14, 15, 16, 17, 18};

        ArrayList<int[]> allArrays = new ArrayList<>();
        allArrays.add(array1);
        allArrays.add(array2);
        allArrays.add(array3);

        for (int i = 0; i < allArrays.size(); i++) {
            sum += sumOfTable(allArrays.get(i));
        }

        System.out.println(sum);
    }

    static float sumOfTable(int[] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


}
