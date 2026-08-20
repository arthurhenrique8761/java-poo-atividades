import java.util.Scanner;

// URI1012
public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double triangle = (a * c)/2;
		double circle = Math.PI * Math.pow(c, 2);
		double trapezoid = ((a + b)/2)*c;
		double square = Math.pow(b, 2);
		double rectangle = a * b;

		System.out.printf("TRIANGULO: %.3f", triangle);
		System.out.printf("CIRCULO: %.3f", circle);
		System.out.printf("TRAPEZIO: %.3f", trapezoid);
		System.out.printf("QUADRADO: %.3f", square);
		System.out.printf("RETANGULO: %.3f", rectangle);

		sc.close();

	}	
}