package courseDay1.course;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ForLoop {
    public static void main(String[] args) {

        multiplicationTable(12);
    }
    public static void multiplicationTable (int n) {
        for (int i = 0; i <= 12; i++) {
            System.out.printf("%d x %d = %d\n", i, n, (int) n*i);
        }
    }
}
