import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("EX09 - Matriz 1, Soma dos valores de uma matriz");
        Random random = new Random();

		int[][] matriz = new int[4][4];
		int soma = 0;

		for (int i=0; i<4; i++) {
			System.out.print("linha " + (i+1) + ": ");
			for (int j=0; j<4; j++) {
				matriz[i][j] = random.nextInt(9);
				soma += matriz[i][j];
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Soma dos valores: " + soma);
    }
}
