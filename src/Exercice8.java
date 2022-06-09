import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        /*
        * Ecrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
        L'utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
        Principe du fonctionnement d'une équation du 2nd degré:
        https://www.maths-et-tiques.fr/telech/Secondegre2ESL.pdf
        * */

        float a, b, c;
        a = 0;
        double delta;
        Scanner input = new Scanner(System.in);

        while (a == 0){
            System.out.print("a: ");
            a = input.nextFloat();
        }


        System.out.print("b: ");
        b = input.nextFloat();

        System.out.print("c: ");
        c = input.nextFloat();

        delta = Math.pow(b, 2) - 4 * a * c;

        boolean isValid = delta >= 0;
        boolean deltaIsNull = delta ==0;
        String solution;

        if (isValid){
            double result1 = (-b + Math.sqrt(delta)) / (2*a);
            double result2 = (-b - Math.sqrt(delta)) / (2*a);

//            if (deltaIsNull) {
//                System.out.println("Only one solution: %.2f", result1);
//            } else {
//                System.out.println("2 solutions: %.2f and %.2f", result1, result2);
//            }

            solution = deltaIsNull ? ("Only one solution: " + Math.round(result1)) : ("2 solutions: " + Math.round(result1) + " and " + Math.round(result2));
            System.out.println(solution);

        } else {
            System.out.println("No solution");
        }



    }
}
