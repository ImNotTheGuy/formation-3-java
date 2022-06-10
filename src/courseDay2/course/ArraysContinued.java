package courseDay2.course;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysContinued {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many scores do you wish to insert ? ");
        int nScores = input.nextInt();

        float scores[] = new float[nScores];

        for (int i = 0; i < scores.length; i++) {
            scores[i] =  Math.round(new Random().nextFloat(0,20) * 10.0f) / 10.0f;
        }

        System.out.println(Arrays.toString(scores));




    }
}
