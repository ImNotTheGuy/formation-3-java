package courseDay2.course;

import java.util.Scanner;

public class ArraysContinued2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("How many elements in array ? ");
        int arrayLength = input.nextInt();

        while (true){
            if (arrayLength >= 1){
                break;
            }
            System.out.printf("Please give a positive number: ");
            arrayLength = input.nextInt();
        }

        float[] scores = new float[arrayLength];
        System.out.printf("Array of length %s succesfully initialized\n", arrayLength);


        for (int i = 0; i < scores.length; i++) {

            System.out.printf("Enter score of student %d: ", i+1);
            float temp_score = input.nextFloat();
            while (true){
                if (temp_score >= 0 && temp_score <= 20){
                    break;
                }
                System.out.printf("Please give valid score: ");
                temp_score = input.nextFloat();

            }

        }



    }
}
