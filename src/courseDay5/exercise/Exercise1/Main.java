package courseDay5.exercise.Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Human human = new Human("Jack", "TheCat", "UK", false, 0);

        System.out.println(human.fullDescription());

        String tempInputStr;

        System.out.printf("First name: ");
        human.setFirstName(input.next());

        System.out.printf("Last name: ");
        human.setLastName(input.next());

        System.out.printf("Country: ");
        human.setCountry(input.next());

        System.out.printf("Are you married ? (y/n): ");
        tempInputStr = input.next();

        if (tempInputStr.equals("y")){
            human.setMarried(true);
        } else {
            human.setMarried(false);
        }

        System.out.printf("Number of kids: ");
        human.setNumberOfKids(input.nextInt());

        System.out.println("Your full name is: " + human.fullName());

        System.out.println("Full description: " + human.fullDescription());

        int a = 1;
        float b = 1f;

        Math.min(a, b);
    }
}
