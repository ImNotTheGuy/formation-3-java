package courseDay5.exercise.Exercice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Human human = new Human();

        String tempInputStr;

        System.out.printf("First name: ");
        human.firstName = input.next();

        System.out.printf("Last name: ");
        human.lastName = input.next();

        System.out.printf("Country: ");
        human.country = input.next();

        System.out.printf("Are you married ? (y/n): ");
        tempInputStr = input.next();

        if (tempInputStr.equals("y")){
            human.married = true;
        } else {
            human.married = false;
        }

        System.out.printf("Number of kids: ");
        human.numberOfKids = input.nextInt();

        System.out.println("Your full name is: " + human.fullName());

    }
}
