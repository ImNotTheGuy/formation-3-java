package courseDay2.course;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int PINcode;
        int PINinput;
        int attempts = 0;


        Scanner input = new Scanner(System.in);
        System.out.print("Create your PIN (4 digits): ");

        while (true) {

            PINcode = input.nextInt();
            if (("" + PINcode).length() == 4) {
                break;
            }
            System.out.print("Please enter a valid PIN: ");
        }

        System.out.println("Succesfully created PIN.");

        System.out.print("\nEnter your PIN: ");

        while (true) {

            PINinput = input.nextInt();

            if (PINinput == PINcode) {
                System.out.println("PIN code correct. Welcome");
                break;
            }
            System.out.printf("Incorrect PIN, please try again (%s attempts remaining): ", 3 - attempts);
            attempts += 1;
        }
    }
}
