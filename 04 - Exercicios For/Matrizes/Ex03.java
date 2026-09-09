public class Ex03 {
    public static void main(String[] args) {
        System.out.println("EX11 - Matriz 3, Triangulo em uma matriz 8x8");
	
		int[][] matriz = new int[8][8];
	
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				if (i>=j) {
					matriz[i][j] = 1;
					System.out.print(matriz[i][j] + " ");
				}	
				else {
					matriz[i][j] = 0;
					System.out.print(matriz[i][j] + " ");
				}
			}
			System.out.println();
		}
    }
}
