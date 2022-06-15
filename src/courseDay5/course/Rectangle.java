package courseDay5.course;

public class Rectangle {
    static double height;
    static double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        Rectangle.height = height;
    }

    public static double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        Rectangle.width = width;
    }

    public Rectangle(){
        System.out.println("Congrats, you created a rectangle !");
    }

    public Rectangle(double newHeight, double newWidth){
        height = newHeight;
        width = newWidth;
    }

    double area(double height, double width){

        return height * width;
    }

    double perimeter(double height, double width){

        return 2 * (height + width);
    }
}
