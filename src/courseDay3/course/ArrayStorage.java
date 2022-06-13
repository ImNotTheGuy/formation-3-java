package courseDay3.course;

import java.util.Arrays;

public class ArrayStorage {

    public static void main(String[] args) {

        // This does not work as a is not yet initialized
        // int a;
        // System.out.println(a);

        // However, when we do this:
        int[] a = new int[5];
        System.out.println(a);
        // This will print the address at which the array a is stored in memory.

        // To display the actual elements of the array, we need to use:
        System.out.println(Arrays.toString(a));
        // The values showed will have been initiliazed to a default value
        //(0 in the case of an integer).

        int[] b = a;

        System.out.println("a" + a + "\nb" +b);
        System.out.println(b == a);

        a[0] = 1;

        System.out.println("a" + a + "\nb" +b);
        System.out.println("a" + Arrays.toString(a) + "\nb" + Arrays.toString(b));
        System.out.println(b == a);

        b[1] = 3;

        System.out.println("a" + a + "\nb" +b);
        System.out.println("a" + Arrays.toString(a) + "\nb" + Arrays.toString(b));
        System.out.println(b == a);

        int[] c = Arrays.copyOf(a, a.length);


        System.out.println("a" + a + "\nc" +c);
        System.out.println("a" + Arrays.toString(a) + "\nc" + Arrays.toString(c));
        System.out.println(a == c);
        System.out.println(c.equals(a));
        System.out.println(Arrays.toString(a).toString() == Arrays.toString(c).toString());
        System.out.println(""+Arrays.toString(a) == ""+Arrays.toString(c));
        System.out.println(Arrays.equals(a, c));


        // Check how Strings are stored
        String test1 = "test";
        String test2 = "test";

        System.out.println(test1 == test2);

        test1 = "testModified";

        System.out.println(test1 + "   /   " + test2);



    }

}
