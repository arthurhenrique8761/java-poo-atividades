import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

       	int alchool = 0;
       	int gas = 0;
       	int diesel = 0;
       	int opt;

       	while (true) {
       		do {
       			opt = sc.nextInt();
       		} while (opt < 0 || opt > 4);

       		if (opt == 1)
       			alchool++;
       		else if (opt == 2)
       			gas++;
       		else if (opt == 3)
       			diesel++;
       		else if (opt == 4)
       			break;
       	}

       	System.out.println("MUITO OBRIGADO");
       	System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d\n", alchool, gas, diesel);

        sc.close();
	}
}