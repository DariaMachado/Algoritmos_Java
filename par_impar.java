import java.util.Locale;
import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, numero;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		for(i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numero = sc.nextInt();
			
			if(numero == 0) {
				System.out.println("NULO");
			}
			else if(numero % 2 == 0 && numero > 0) {
				System.out.println("PAR POSITIVO");
			}
			else if(numero % 2 == 0 && numero < 0) {
				System.out.println("PAR NEGATIVO");
			}
			else if(numero % 2 != 0 && numero > 0) {
				System.out.println("IMPAR POSITIVO");
			}
			else if(numero % 2 != 0 && numero < 0) {
				System.out.println("IMPAR NEGATIVO");
			}
		}
		
		sc.close();
	}
}
