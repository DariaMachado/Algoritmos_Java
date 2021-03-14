import java.util.Locale;
import java.util.Scanner;

public class acima_diagonal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, j, soma = 0;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				if(i < j) {
					soma = soma + mat[i][j];
				}
			}
		}
		
		System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d", soma);

		sc.close();
	}

}
