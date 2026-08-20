public class Triangle implements Shape{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base*height)/2;
    }

    @Override
    public String toString() {
        return String.format("Triangle: B=%.2f, H=%.2f, A=%.2f", base, height, getArea());
    }

}
