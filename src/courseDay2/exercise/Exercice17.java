package courseDay2.exercise;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercice17 {
    public static void main(String[] args) {

        /*
        Ecrire un programme Java qui demande à l'utilisateur de remplir un tableau d'entiers à partir du clavier.
        Puis le programme devra lui demander d'entrer un nombre à rechercher dans le tableau.
        Si nombre existe, le programme lui dira que le nombre existe et le nombre de fois qu'ils se retrouve dans le tableau
        Sinon le programme lui dira que le nombre recherché n'existe pas dans le tableau
        Ex : tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
        ->Entrer un nombre à rechercher : 6
        ->6 existe et se retrouve 3 fois dans le tableau (edited)
        * */

        Scanner input = new Scanner(System.in);
        int arrayLength;

        while (true) {
            System.out.printf("Table length: ");
            arrayLength = input.nextInt();
            if (arrayLength >= 1){
                break;
            }
            System.out.println("Please positive number...");
        }

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Add a number into array: ");
            array[i] = input.nextInt();
        }

        System.out.printf("Number to lookup: ");
        int lookupNumber = input.nextInt();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == lookupNumber){
                counter++;
            }
        }

        if (counter>0){
            System.out.printf("Number %d exists and was found %d times", lookupNumber, counter);
        } else {
            System.out.printf("Number %d was not found in the array", lookupNumber);
        }

    }
}
