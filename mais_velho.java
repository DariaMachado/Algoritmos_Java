import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, posicao = 0, maisVelho; 
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		maisVelho = idade[0];
		
		for(i = 0; i < n; i++) {
			if(idade[i] > maisVelho) {
				maisVelho = idade[i];
				posicao = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicao]);
		
		sc.close();
	}
}
