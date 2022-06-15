package courseDay4.course;

public class Methods {

    public static void main(String[] args) {

        int a, b, c;
        a = 1;
        b = 234;
        c = 4;

        solve(a,b,c);

        System.out.println(Math.pow(a,b));

        float d = 1.2f;
        float e = 10.0f;
        float f = 1.8f;

        delta(a,b,c);
        delta(d,e,f);

    }
    static float delta(int a, int b, int c) {

        return b * b - 4 * a * c;
    }

    static float delta(float a, float b, float c){

        return b * b - 4 * a * c;
    }
    static void solve(int a, int b, int c){

        float delta = delta(a,b,c);

        if (delta > 0){
            System.out.printf("Solution 1: x1 = %s\n", -b + Math.sqrt(delta) / (2 * a));
            System.out.printf("Solution 2: x2 = %s", -b - Math.sqrt(delta) / (2 * a));

        } else if (delta == 0){
            System.out.printf("Unique solution: x0 = %s", -b + Math.sqrt(delta) / (2 * a));

        } else{
            System.out.println("No solution");
        }
    }
}
