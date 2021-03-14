import java.util.Locale;
import java.util.Scanner;

public class soma_matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m, n, i, j;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		m = sc.nextInt();
		
		System.out.print("Quantas colunas vai ter cada matriz? ");
		n = sc.nextInt();
		
		int[][] A = new int[m][n];
		int[][] B = new int[m][n];
		int[][] C = new int[m][n];
		
		System.out.printf("Digite os valores da matriz A:\n");
		
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.printf("Digite os valores da matriz B:\n");
		
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				B[i][j] = sc.nextInt();
			}
		}
		
		System.out.printf("MATRIZ SOMA:\n");
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		for(i = 0; i < m; i++ ) {
			for(j = 0; j < n; j++) {
				System.out.printf("%d ", C[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
