import java.util.Locale;
import java.util.Scanner;

public class soma_linhas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m, n, i, j;
		double soma;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		m = sc.nextInt();
		
		System.out.print("Qual a quantidade de colunas da matriz? ");
		n = sc.nextInt();
		
		double[][] mat = new double[m][n];
		double[] vetSoma = new double[m];
		
		for(i = 0; i < m; i++) {
			System.out.printf("Digite os elementos da %da. linha:\n", i + 1);
			for(j = 0; j < n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		System.out.printf("VETOR GERADO:\n");
		
		for(i = 0; i < m; i++) {
			soma = 0;
			for(j = 0; j < n; j++) {
				soma = soma + mat[i][j];
			}
			vetSoma[i] = soma;
		}
		
		for(i = 0; i < m; i++) {
			System.out.printf("%.1f\n", vetSoma[i]);
		}
		
		sc.close();
	}

}
