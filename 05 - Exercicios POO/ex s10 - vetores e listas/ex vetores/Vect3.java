import java.util.Random;

public class Vect3{
	public static void main(String[] agrs){
		Random rnd = new Random();
		int greater = 0;
		int index = 0;
		
		int[] vect = new int[51];
		for(int i=0; i<vect.length; i++){
			vect[i] = rnd.nextInt(51);
			if(vect[i] >= greater){
				greater = vect[i];
				index = i;
			}
		}
		
		System.out.print("Vetor: ");
		for(int value : vect){
			System.out.print(value + " ");
		}
		
		System.out.println("\nO maior numero e " + greater + ", indice " + index);
	}
	
}