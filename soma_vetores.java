import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		
		System.out.printf("Digite os valores do vetor A:\n");
		for(i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.printf("Digite os valores do vetor B:\n");
		for(i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		
		System.out.printf("VETOR RESULTANTE:\n");
		for(i = 0; i < n; i++) {
			C[i] = A[i] + B[i];
			System.out.printf("%d\n", C[i]);
		}
	
		sc.close();
	}
}
