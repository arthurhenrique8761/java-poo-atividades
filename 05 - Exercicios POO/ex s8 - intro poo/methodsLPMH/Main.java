import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int n = 0;
		
		System.out.print("Escolha um método (1, 2, 3): ");
		n = sc.nextInt();
		while (n < 1 || n > 3) {
			System.out.print("\nNumero invalido\nDigite novamente: ");
			n = sc.nextInt();
		}
		
		switch (n) {
			case 1 -> {
				System.out.println("\n- Metodo 1 - Indices impares -");
				
				int[] vetor = new int[50];
				for (int numero : vetor) {
					numero = random.nextInt(20)+1;
					System.out.print(numero + " ");
				}
				System.out.println("\nQuantidade de elementos impares divisiveis por 3: " + verificarVetor(vetor));
			}
			case 2 -> {
				System.out.println("\n- Metodo 2 - Sequencia -");
				sequencia();
			}
			case 3 -> {
				System.out.println("\n- Metodo 2 - Sequencia -");
				
				int[][] matriz = new int[3][3];
				for (int i=0; i<3; i++) {
					for (int j=0; j<3; j++) {
						matriz[i][j] = 0;
					}
				}
				assentos(sc, matriz);
			}
		}
		
		
		sc.close();
	}
	
	public static int verificarVetor(int[] vetor) {
		int odd = 0;
		for (int i=0; i<vetor.length; i++) {
			if (i%2 != 0 && vetor[i]%3 == 0)
				odd++;
		}
		return odd;
	}
	
	public static void sequencia() {
		int a = 100;
		int b = 1;
		
		for (int i=0; i<30; i++) {
			if (b%2 == 0) {
				System.out.print("-" + a + "/" + b + " ");
			}
			else {
				System.out.print("+" + a + "/" + b + " ");
			}
			a--;
			b++;
		}
	}
	
	public static void assentos(Scanner sc, int[][] matriz) {
		
		while (true ) {
			try {
				System.out.println("\nAssentos livres:");
				printMatrix(matriz);
				
				System.out.println("\nEscolha um assento");
				
				System.out.print("Fileira (0 - 2): ");
				int fileira = sc.nextInt();
				if (fileira == -1)
					System.exit(0);
				if (!sc.hasNextInt())
					throw new InputMismatchException();
				if (fileira > 3 || fileira < 0)
					throw new ArrayIndexOutOfBoundsException();
				
				sc.nextLine();
				
				System.out.print("Coluna (0 - 2): ");
				int coluna = sc.nextInt();
				if (!sc.hasNextInt())
					throw new InputMismatchException();
				if (coluna > 3 || coluna < 0) {
					throw new ArrayIndexOutOfBoundsException();
				}
				
				if (matriz[fileira][coluna] != 0) {
					System.out.println("Assento Ocupado!");
					continue;
				}
				else {
					matriz[fileira][coluna] = 1;
					System.out.println("Assento reservado com sucesso!");
				}
				
			}
			catch (InputMismatchException e) {
				System.out.println("Erro: Caractere inválido");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro: Fileira não existente");
			}
		}
		

	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i=0; i < matrix.length; i++) {
			System.out.print("Fileira " + i + ": ");
			for (int j=0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
