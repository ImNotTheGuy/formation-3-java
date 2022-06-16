package courseDay6.exercise.exercise2;

public class Main {

    public static void main(String[] args) {

        Shapes shape = new Shapes();
        double[] lengths = {1.,2.,3.};

        shape.setLengthOfSides(lengths);

        System.out.println(shape.perimeter());

    }
}
