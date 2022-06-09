import java.util.Scanner;

public class Displays {
    public static void main(String[] args) {

        String nom = "Jack";
        char genre = 'M';
        byte age = 10;
        float weight_kg = 5.2f;

        System.out.printf("Name: %s\nGenre: %s\nAge: %d\nWeight: %.10fkg", nom, genre, age, weight_kg);
    }

}
