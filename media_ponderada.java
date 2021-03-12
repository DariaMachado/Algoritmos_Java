import java.util.Locale;
import java.util.Scanner;

public class media_ponderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double valor1, valor2, valor3, mediaP;
		
		System.out.print("Quantos casos voce vai digitar? ");
		n = sc.nextInt();
		
		for(i = 0; i < n; i++) {
			System.out.printf("Digite tres numeros:\n");
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			
			mediaP = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0) / 10.0;
			System.out.printf("MEDIA = %.1f\n", mediaP);
		}
	
		sc.close();
	}

}
