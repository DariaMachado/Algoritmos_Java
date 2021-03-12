import java.util.Locale;
import java.util.Scanner;

public class comerciante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, abaixo = 0, entre = 0, acima = 0; 
		double totalC = 0, totalV = 0, lucroTotal;
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		n = sc.nextInt();
		
		String[] produto = new String[n];
		double[] compra = new double[n];
		double[] venda = new double[n];
		double[] porcentagem = new double[n];
		
		for(i = 0; i < n; i++) {
			System.out.printf("Produto %d:\n", i + 1);
			System.out.print("Nome: ");
			produto[i] = sc.next();
			
			System.out.print("Preco de compra: ");
			compra[i] = sc.nextDouble();
			
			System.out.print("Preco de venda: ");
			venda[i] = sc.nextDouble();
		}
		
		for(i = 0; i < n; i++) {
			porcentagem[i] = (venda[i] - compra[i]) * 100 / compra[i];
		}
		
		for(i = 0; i < n; i++) {
			if(porcentagem[i] < 10) {
				abaixo++;
			}
			else if(porcentagem[i] <= 20) {
				entre++;
			}
			else {
				acima++;
			}
		}
		
		for(i = 0; i < n; i++) {
			totalC = totalC + compra[i];
			totalV = totalV + venda[i];
		}
		
		lucroTotal = totalV - totalC;
		
		System.out.printf("\nRELATORIO:\n");
		System.out.printf("Lucro abaixo de 10%%: %d\n", abaixo);
		System.out.printf("Lucro entre 10%% e 20%%: %d\n", entre);
		System.out.printf("Lucro acima de 20%%: %d\n", acima);
		System.out.printf("Valor total de compra: %.2f\n", totalC);
		System.out.printf("Valor total de venda: %.2f\n", totalV);
		System.out.printf("Lucro total: %.2f\n", lucroTotal);
		
		sc.close();
	}
}
