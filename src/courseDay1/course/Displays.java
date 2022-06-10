package courseDay1.course;

import java.util.Scanner;

public class Displays {
    public static void main(String[] args) {

        boolean isMarried = false;
        System.out.printf("You %s married\n", isMarried?"are":"are not");

        String marriedStatus = isMarried?"are":"are not";
        System.out.printf("You %s married\n", marriedStatus);

    }

}
