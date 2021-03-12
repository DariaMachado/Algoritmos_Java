import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, posicao = 0;
		double maior;
		
		System.out.print("Quanto numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(i = 0; i < n; i ++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		maior = vet[0];
		for(i = 1; i < n; i++) {
			if(vet[i] > maior) {
				maior = vet[i];
				posicao = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);
	
		sc.close();
	}
}
