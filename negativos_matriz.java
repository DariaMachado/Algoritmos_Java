import java.util.Locale;
import java.util.Scanner;

public class negativos_matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m, n, i, j;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		m = sc.nextInt();
		
		System.out.print("Qual a quantidade de colunas da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.printf("VALORES NEGATIVOS:\n");
		
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					System.out.printf("%d\n", mat[i][j]);
				}
			}
		}
		
		sc.close();
	}

}
