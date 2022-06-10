package courseDay2.course;

import java.sql.Array;
import java.util.regex.Matcher;

public class ArraysIntro {

    public static void main(String[] args) {

        // Declaring a fixed array composed of floats:

        float[] examScores = {
                17f,
                13f,
                15f,
                18f,
                14f,
                1f,
        };



        float totalScore = 0;
//        float minScore = 0;
//        float maxScore = 0;

        for (int i = 0; i < examScores.length; i++) {
            float tempScore = examScores[i];
//            minScore = Math.min(minScore, tempScore);
//            maxScore = Math.max(maxScore, tempScore);
            totalScore += tempScore;
        }

        float averageScore = totalScore / examScores.length;

        System.out.println("averageScore: " + averageScore);
//        System.out.println("minScore: " + minScore);
//        System.out.println("maxScore: " + maxScore);


    }





}
