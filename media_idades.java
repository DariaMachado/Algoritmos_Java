import java.util.Locale;
import java.util.Scanner;

public class media_idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, contIdade = 0, soma = 0;
		double media;
		
		System.out.println("Digite as idades:");
		idade = sc.nextInt();
		
		if(idade < 0 ) {
			System.out.println("IMPOSSIVEL CALCULAR");
		}
		else {
			while(idade >= 0) {
				soma = soma + idade;
				contIdade++;
				idade = sc.nextInt();
			}
			media = (double) soma / contIdade;
			System.out.printf("MEDIA = %.2f", media);
		}
		
		sc.close();
	}
}
