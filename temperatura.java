import java.util.Locale;
import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char escala;
		double tempF, tempC;
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		escala = sc.next().charAt(0);
		
		if(escala == 'C') {
			System.out.print("Digite a temperatura em Celsius: ");
			tempC = sc.nextDouble();
			
			tempF = (9.0/5.0 * tempC) + 32;
			System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", tempF));
		}
		else if(escala == 'F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			tempF = sc.nextDouble();
			
			tempC = 5.0/9.0 * (tempF-32);
			System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", tempC));
		}
		
		sc.close();
	}

}
