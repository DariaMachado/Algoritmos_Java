import java.util.Locale;
import java.util.Scanner;

public class tempo_de_jogo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, duracao;
		
		System.out.print("Hora inicial: ");
		inicio = sc.nextInt();
		System.out.print("Hora final: ");
		fim = sc.nextInt();
		
		if(inicio >= fim) {
			duracao = 24 - inicio + fim;
		}
		else {
			duracao = fim - inicio;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		
		sc.close();
	}
}
