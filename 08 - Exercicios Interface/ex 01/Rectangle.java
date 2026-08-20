public class Rectangle implements Shape{

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private double length;
    private double width;

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle: L=%.2f, W=%.2f, A=%.2f", length, width, getArea());
    }

}
