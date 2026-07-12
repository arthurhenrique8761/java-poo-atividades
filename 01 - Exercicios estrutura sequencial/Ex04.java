import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		short number = sc.nextShort();
		int workedHours = sc.nextInt();
		double wage = sc.nextDouble();

		double salary = workedHours * wage;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", salary);

		sc.close();

	}	
}