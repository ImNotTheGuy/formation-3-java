import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        /*
        * Écrivez un programme Java qui demande à l'utilisateur d'entrer un nombre et qui ensuite va calculer et afficher la factorielle de ce nombre:

        Ex:

        Nombre : 3

        Factorielle de 3 : 3x2x1 = 6

        Regle de calcul de factorielle : http://villemin.gerard.free.fr/Denombre/Factorie.htm
*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");

        int n = input.nextInt();
        int factoriel = 1;
        String fctString = "1";

        for (int i = 1; i <= n; i++) {
            factoriel *= i;
            if (i > 1) {
                fctString += "x" + i;
            }

        }
        System.out.println(fctString + " = " + factoriel);
    }
}
