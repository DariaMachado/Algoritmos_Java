import java.util.Locale;
import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, fatorial = 1;
		
		System.out.print("Digite o valor de N: ");
		n = sc.nextInt();
		
		for(i = n; i > 0; i--) {
			fatorial = fatorial * i;
		}
		
		System.out.printf("FATORIAL = %d", fatorial);

		sc.close();
	}
}
