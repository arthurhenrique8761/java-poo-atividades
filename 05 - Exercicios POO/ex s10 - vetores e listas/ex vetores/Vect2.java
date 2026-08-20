import java.util.Random;

public class Vect2 {
	public static void main(String[] agrs){
		
		Random rnd = new Random();
		int oddSum = 0;
		
		int[] vect = new int[15];
		for(int i=0; i<vect.length; i++){
			vect[i] = rnd.nextInt(51);
			if (i % 2 != 0)
				oddSum += vect[i];
		}
		
		System.out.print("Vetor: ");
		for(int value : vect) {
			System.out.print(value + " ");
		}
		
		System.out.print("\nSoma dos valores impares = " + oddSum + "\n");
		
	}
	
}