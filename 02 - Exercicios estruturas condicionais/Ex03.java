import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (b > a) {
			int temp = b;
			b = a;
			a = temp;
		}

		if (a % b == 0)
			System.out.println("Sao multiplos");
		else
			System.out.println("Nao sao multiplos");

		sc.close();
	}	
}