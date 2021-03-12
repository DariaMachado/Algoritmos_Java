import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, contM = 0, contF = 0;
		double maiorAlt, menorAlt, somaAlt = 0, mediaAlt; 
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genero[i] = sc.next().charAt(0);
		}
		
		maiorAlt = altura[0];
		menorAlt = altura[0];
		
		for(i = 1; i < n; i++) {
			if(altura[i] > maiorAlt) {
				maiorAlt = altura[i];
			}
			if(altura[i] < menorAlt) {
				menorAlt = altura[i];
			}
		}
		
		for(i = 0; i < n; i++) {
			if(genero[i] == 'F') {
				somaAlt = somaAlt + altura[i];
				contF++;
			}
			else {
				contM++;
			}
		}
		
		mediaAlt = somaAlt / contF;
		
		System.out.printf("Menor altura = %.2f\n", menorAlt);
		System.out.printf("Maior altura = %.2f\n", maiorAlt);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlt);
		System.out.printf("Numero de homens = %d\n", contM);
		
		sc.close();
	}
}
