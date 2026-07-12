import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String result = x < 0 ? "NEGATIVO" : "NAO NEGATIVO";
		System.out.println(result);

		sc.close();
	}	
}