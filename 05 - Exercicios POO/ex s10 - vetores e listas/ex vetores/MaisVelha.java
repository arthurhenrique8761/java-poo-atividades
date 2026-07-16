import java.util.Scanner;

public class MaisVelha
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar?: ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		int maiorIdade = 0;
		String maxNome = "";
		
		for (int i = 0; i < n; i++) {
		    System.out.printf("Dados da %da pessoa: \n", i+1);
		    System.out.print("Nome: ");
		    nomes[i] = sc.next();
		    System.out.print("Idade: ");
		    idades[i] = sc.nextInt();
		    if (idades[i] > maiorIdade) {
		        maiorIdade += idades[i];
		        maxNome = nomes[i];
		    }
		}
		
		System.out.println("PESSOA MAIS VELHA: " + maxNome.toUpperCase());
		
		sc.close();
	}
}