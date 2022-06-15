package courseDay5.course;

public class Main {
    public static void main(String[] args) {

        Rectangle2 rectangle = new Rectangle2();

        System.out.println("Current height: " + rectangle.getHeight());
        System.out.println("Current width: " + rectangle.getWidth());

        rectangle.setHeight(-12.);
        rectangle.setHeight(12.);

        rectangle.setWidth(-12.);
        rectangle.setWidth(12.);

        System.out.println("New height: " + rectangle.getHeight());
        System.out.println("New width: " + rectangle.getWidth());

    }
}
