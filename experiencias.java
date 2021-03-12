import java.util.Locale;
import java.util.Scanner;

public class experiencias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, qtd, coelhos = 0, ratos = 0, sapos = 0, total;
		char tipo;
		double perC, perR, perS;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		n = sc.nextInt();
		
		for(i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			qtd = sc.nextInt();
			
			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);
			
			if(tipo == 'C') {
				coelhos = coelhos + qtd;
			}
			else if(tipo == 'R') {
				ratos = ratos + qtd;
			}
			else if(tipo == 'S') {
				sapos = sapos + qtd;
			}
		}
		
		total = coelhos + ratos + sapos;
		perC = (double) coelhos / total * 100.0;
		perR = (double) ratos / total * 100.0;
		perS = (double) sapos / total * 100.0;
		
		System.out.printf("\n\nRELATORIO FINAL:\n");
		System.out.printf("Total: %d cobaias\n", total);
		System.out.printf("Total de coelhos: %d\n", coelhos);
		System.out.printf("Total de ratos: %d\n", ratos);
		System.out.printf("Total de sapos: %d\n", sapos);
		System.out.printf("Percentual de coelhos: %.2f\n", perC);
		System.out.printf("Percentual de ratos: %.2f\n", perR);
		System.out.printf("Percentual de sapos: %.2f\n", perS);
		
		sc.close();
	}

}
