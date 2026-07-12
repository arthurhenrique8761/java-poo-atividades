import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double radius = sc.nextDouble();
		double area = Math.PI * Math.pow(radius, 2);

		System.out.printf("A=%.4f\n", area);

		sc.close();

	}	
}