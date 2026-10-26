import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = 0;

        System.out.print("Digite um número de 1 a 3 (0 para sair): ");
        n = sc.nextInt();

        while (n < 0 || n > 3) {
            System.out.print("Número invalido\nDigite novamente: ");
            n = sc.nextInt();
        }

        switch (n) {
            case 1 -> {
                int[] vetor = new int[50];
                for (int i = 0; i < vetor.length; i++) {
                    vetor[i] = random.nextInt(50) + 1;
                }
                int value = metodo1(vetor);

                for (int elements : vetor) {
                    System.out.print(elements + " ");
                }
                System.out.println("Qtde de valores em índice ímpar diviseis por três: " + value);
            }
            case 2 -> metodo2();
            case 3 -> {
                int[][] matriz = new int[3][3];
                metodo3(matriz, sc);
            }
            case 0 -> {
                System.out.println("Saindo...");
                sc.close();
                System.exit(0);
            }
        }

        sc.close();
    }

    public static int metodo1(int[] vetor) {
        int oddIndexDivThree = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0 && vetor[i] % 3 == 0) {
                oddIndexDivThree++;
            }
        }
        return oddIndexDivThree;
    }

    public static void metodo2() {
        int a = 100;
        int b = 1;
        int sumAB = 0;

        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0)
                System.out.print("+" + a + "/" + b + " ");
            else
                System.out.print("-" + a + "/" + b + " ");

            if (i < 30) {
                sumAB += (a / b);
            }

            a--;
            b++;
        }
        System.out.println();

        System.out.println("Soma dos 10 primeiros elementos: " + sumAB);
    }

    public static void metodo3(int[][] matriz, Scanner sc) {

        while (true) {
            try {
                System.out.println("- Sistema de Assentos -");
                System.out.print("Informe a linha: ");
                int optionLine = sc.nextInt();

                if (optionLine == -1)
                    System.exit(0);

                System.out.print("Informe a coluna: ");
                int optionColumn = sc.nextInt();

                if (matriz[optionLine][optionColumn] == 1) {
                    System.out.println("Assento preechido. Escolha novamente");
                } else {
                    matriz[optionLine][optionColumn] = 1;
                    printMatrix(matriz);
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: linha ou coluna não existente");
            } catch (InputMismatchException e) {
                System.out.println("Erro: letra ou caractere (digite apenas números)");
            }
        }

    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
