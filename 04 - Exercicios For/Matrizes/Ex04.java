import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("EX12 - Matriz 4, Matriz identidade");
		
		Scanner sc = new Scanner(System.in);

		int somaDiagonal = 0;
		int demais = 0;
		int n = 0;
		
		int[][] matriz = new int[3][3];
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("Digite 0 ou 1: ");
				n = sc.nextInt();
				while (n < 0 || n > 1) {
					System.out.print("Numero inválido, digite novamente: ");
					n = sc.nextInt();
				}
				matriz[i][j] = n;
			}
		}
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (i==j) {
					somaDiagonal += matriz[i][j];
				}
				else {
					demais += matriz[i][j];
				}
			}
		}
		
		if (demais == 0 && somaDiagonal == 3) {
			System.out.println("\nMatriz identidade");
		}
		else {
			System.out.println("Matriz não identidade");
		}
        
        sc.close();
    }
}
