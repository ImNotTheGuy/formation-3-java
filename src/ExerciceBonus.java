public class ExerciceBonus {
    public static void main(String[] args) {
        /*
        *
        * Écrivez un petit programme Java, Degre3.java, vous permettant d'évaluer un polynôme du
        3ème degré de la forme:
        *
        * ((a+b)/2)x3 + (a+b)2x2 + a + b + c

        Exemple d'exécution:
        Entrez a (int) : 1
        Entrez b (int) : 2
        Entrez c (int) : 3
        Entrez x (double) : 3.5
        La valeur du polynôme est : 180.5625
        * */
        int a, b, c;
        a = 1;
        b = 2;
        c = 3;

        double x = 3.5;
        double x2 = Math.pow(x, 2);
        double x3 = Math.pow(x, 3);
        double A = (a + b) / 2;
        double B = Math.pow((a + b), 2);
        double C = a + b + c;

//        double result = A * x3 + B * x2 + C;
        System.out.println(Math.pow( 1.5f , 2));
        double result = Math.pow(x, 3) * ( ( a + b ) / 2.0 )  + (2 * Math.pow(a + b, 2) * Math.pow(x, 2)) + a + b + c;

        System.out.println(result);
    }
}
