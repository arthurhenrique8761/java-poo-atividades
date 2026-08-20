import java.util.Scanner;

// URI1010
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		short code1 = sc.nextShort();
		short qtd1 = sc.nextShort();
		double value1 = sc.nextDouble();

		short code2 = sc.nextShort();
		short qtd2 = sc.nextShort();
		double value2 = sc.nextDouble();

		double total = (qtd1 * value1) + (qtd2 * value2);

		System.out.printf("VALOR A PAGAR: R$ %.2f", total);

		sc.close();

	}	
}