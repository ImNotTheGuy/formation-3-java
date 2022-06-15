package courseDay5.course;

public class Rectangle2 {


    private double height;
    private double width;

    public Rectangle2() {
    }
    public Rectangle2(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
            System.out.println("New height set: " + height);
        } else {
            System.out.println("Height should be strictly positive");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
            System.out.println("New width set: " + width);
        } else {
            System.out.println("Width should be strictly positive");
        }
    }

    public double surface() {
        return height * width;
    }

    public double perimeter() {
        return height * width;
    }


}
