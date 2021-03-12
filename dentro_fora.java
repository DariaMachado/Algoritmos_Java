import java.util.Locale;
import java.util.Scanner;

public class dentro_fora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, i, n, dentro = 0, fora = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		for(i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				dentro++;
			}
			else {
				fora++;
			}
		}
		
		System.out.printf("%d DENTRO\n", dentro);
		System.out.printf("%d FORA\n", fora);
		
		sc.close();
	}

}
