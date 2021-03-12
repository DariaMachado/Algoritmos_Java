import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, contPares = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.printf("\nNUMEROS PARES:\n");
		
		for(i = 0; i < n; i++) {
			if(vet[i] % 2 == 0) {
				System.out.printf("%d ", vet[i]);
				contPares++;
			}
		}
		
		System.out.printf("\nQUANTIDADE DE PARES = %d\n", contPares);
	
		sc.close();
	}

}
