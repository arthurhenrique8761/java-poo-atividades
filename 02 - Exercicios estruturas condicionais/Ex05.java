import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int item = sc.nextInt();
		int qtde = sc.nextInt();
		double total = 0;

		switch (item) {
			case 1 -> total = 4 * qtde;
			case 2 -> total = 4.50 * qtde;
			case 3 -> total = 5 * qtde;
			case 4 -> total = 2 * qtde;
			case 5 -> total = 1.50 * qtde;
		}

		System.out.printf("Total: R$ %.2f\n", total);

		sc.close();
	}
}