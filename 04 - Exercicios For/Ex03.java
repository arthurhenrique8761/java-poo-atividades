import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

       	double n = sc.nextDouble();
       	double average;

       	for (int i = 1; i <= n; i++) {
       		double x = sc.nextDouble();
       		double y = sc.nextDouble();
       		double z = sc.nextDouble();
       		average = ((x*2) + (y*3) + (z*5)) / (10);
       		System.out.printf("%.1f\n", average);
       	}

		sc.close();
    }
}