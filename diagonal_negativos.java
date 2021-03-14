import java.util.Scanner;

public class diagonal_negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, contNeg = 0;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + " , " + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL: ");
		
		for(i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++ ) {
				if(mat[i][j] < 0) {
					contNeg++;
				}
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE NEGATIVOS = " + contNeg);
		
		sc.close();
	}
}
