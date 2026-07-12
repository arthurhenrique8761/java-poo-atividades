import java.util.Scanner;

public class Ex02 {

        public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        while (true) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();

        	if (x == 0 || y == 0)
        		break;

        	if (x > 0) {
        		if (y > 0)
        			System.out.println("primeiro");
        		else
        			System.out.println("quarto");
        	}
        	else {
        		if (y > 0)
        			System.out.println("segundo");
        		else
        			System.out.println("terceiro");
        	}
        }

        sc.close();	
	}
}