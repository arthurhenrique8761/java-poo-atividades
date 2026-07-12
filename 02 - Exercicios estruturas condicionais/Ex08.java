import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        double salary = sc.nextDouble();
        
        if (salary <= 2000)
            System.out.println("Isento");
        else if (salary <= 3000) {
            salary = (salary - 2000.01)*0.08;
            System.out.printf("R$ %.2f\n", salary);
        }
        else if (salary <= 4500) {
            salary = 80+(salary - 3000)*0.18;
            System.out.printf("R$ %.2f\n", salary);
        }
        else {
            salary = 350+(salary - 4500)*0.28;
            System.out.printf("R$ %.2f\n", salary);
        }

        sc.close();
	}

}