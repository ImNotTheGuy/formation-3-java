package courseDay1.course;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Name: "); // note that we use print and not println to avoid writing on the line below
        String name = input.nextLine();


        System.out.print("Gender: (M/F or N) ");
        char gender = input.next().charAt(0);

        System.out.print("Your age: ");
        int age = input.nextInt();

        System.out.print("Your weight: ");
        float weight = input.nextFloat();

        System.out.println("Name: " + name );
        System.out.println("Gender: " + gender );
        System.out.println("Age: " + age );
        System.out.println("Weight: " + weight );


    }

}
