import java.util.Locale;
import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, multiplicacao;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();
		
		for(i = 1; i <= 10; i++) {
			multiplicacao = n * i;
			System.out.printf("%d X %d = %d\n", n, i, multiplicacao);
		}
		
		sc.close();
	}

}
