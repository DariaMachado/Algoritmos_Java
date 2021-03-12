import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, menor = 0;
		double media, porcentagem, somaAlt = 0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		for(i = 0; i < n; i++) {
			somaAlt = somaAlt + altura[i];
		}
		
		media = somaAlt / n;
		System.out.printf("\nAltura media: %.2f\n", media);
		
		for(i = 0; i < n; i++) {
			if(idade[i] < 16) {
				menor++;
			}
		}
		
		porcentagem = menor * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);
		
		for(i = 0; i < n; i++) {
			if(idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}
		}
	
		sc.close();
	}

}
