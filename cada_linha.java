import java.util.Locale;
import java.util.Scanner;

public class cada_linha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, j, maior;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		int[] maiorL = new int[n];
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.printf("MAIOR ELEMENTO DE CADA LINHA:\n");
		
		for(i = 0; i < n; i++) {
			maior = mat[i][0];
			for(j = 0; j < n; j++) {
				if(mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}
			maiorL[i] = maior;
		}
		
		for(i = 0; i < n; i++) {
			System.out.printf("%d\n", maiorL[i]);
		}
		
		sc.close();
	}

}
