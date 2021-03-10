import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtd;
		double preco, dinheiro, troco, falta, total;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		total = preco * qtd;
		
		if(dinheiro < total) {
			falta = total - dinheiro;
			System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", falta) + " REAIS");
		}
		else {
			troco = dinheiro - total;
			System.out.println("TROCO = " + String.format("%.2f", troco));
		}
		
		sc.close();
	}
}
