import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("EX10 - Matriz 2, Soma de matrizes");
		Random random = new Random();
		
		int[][] A = new int[2][2];
		int[][] B = new int[2][2];
		int[][] C = new int[2][2];
		
		System.out.println("Vetor A: ");
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				A[i][j] = random.nextInt(9);
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nVetor B: ");
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				B[i][j] = random.nextInt(9);
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nVetor C (Soma dos vetores A e B): ");
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				C[i][j] = (A[i][j] + B[i][j]);
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
    }
}
