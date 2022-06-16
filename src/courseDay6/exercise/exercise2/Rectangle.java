package courseDay6.exercise.exercise2;

/**
 * The type Rectangle.
 */
public class Rectangle {

    private double height;
    private double width;

    /**
     * Perimeter double.
     *
     * @return the perimeter of the object Rectangle
     */
    public double perimeter(){
        return (this.height + this.width) * 2;
    }

    /**
     * Area double.
     *
     * @return the area of the object Rectangle
     */
    public double area(){
        return this.height * this.width;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(double width) {
        this.width = width;
    }
}
