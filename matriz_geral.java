import java.util.Locale;
import java.util.Scanner;

public class matriz_geral {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, j, linha, coluna;
		double soma = 0;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		double[][] mat = new double[n][n];
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextDouble();
			}
		}
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				if(mat[i][j] > 0) {
					soma = soma + mat[i][j];
				}
			}
		}
		
		System.out.printf("\nSOMA DOS POSITIVOS: %.1f\n\n", soma);
		
		System.out.print("Escolha uma linha: ");
		linha = sc.nextInt();
		
		System.out.print("LINHA ESCOLHIDA: ");
		for(i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat[linha][i]);
		}
		
		System.out.printf("\n\nEscolha uma coluna: ");
		coluna = sc.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for(i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat[i][coluna]);
		}
		
		System.out.printf("\n\nDIAGONAL PRINCIPAL: ");
		for(i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat[i][i]);
		}
		
		System.out.printf("\n\nMATRIZ ALTERADA:\n");
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}
		}
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}

}
