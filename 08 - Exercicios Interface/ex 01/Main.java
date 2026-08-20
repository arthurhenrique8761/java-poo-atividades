import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rectangle length: ");
        double rectLength = sc.nextDouble();
        System.out.print("Rectangle width: ");
        double rectWidth = sc.nextDouble();
        Rectangle rectangle = new Rectangle(rectLength, rectWidth);

        System.out.print("\nTriangle base: ");
        double triBase = sc.nextDouble();
        System.out.print("Triangle height: ");
        double triHeight = sc.nextDouble();
        Triangle triangle = new Triangle(triBase, triHeight);

        System.out.print("\nCircle radius: ");
        double circleRadius = sc.nextDouble();
        Circle circle = new Circle(circleRadius);

        System.out.println("Areas: ");
        System.out.printf("%s\n%s\n%s\n", rectangle, triangle, circle);

        sc.close();
    }
}
