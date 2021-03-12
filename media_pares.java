import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, somaPares = 0, contPares = 0;
		double mediaPares;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		for(i = 0; i < n; i++) {
			if(vet[i] % 2 == 0) {
				somaPares = somaPares + vet[i];
				contPares++;
			}
		}
		
		if(contPares == 0) {
			System.out.printf("NENHUM NUMERO PAR\n");
		}
		else {
			mediaPares = (double) somaPares / contPares;
			System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
		}

		sc.close();
	}
}
