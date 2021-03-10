import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double valorPagar = 0;
		
		System.out.print("Codigo do produto comprado: ");
		codigo = sc.nextInt();
		
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		
		if(codigo == 1) {
			valorPagar = 5.00 * qtd;
		}
		else if(codigo == 2) {
			valorPagar = 3.50 * qtd;
		}
		else if(codigo == 3) {
			valorPagar = 4.80 * qtd;
		}
		else if(codigo == 4) {
			valorPagar = 8.90 * qtd;
		}
		else if(codigo == 5) {
			valorPagar = 7.32 * qtd;
		}
		
		System.out.printf("Valor a pagar: R$ " + String.format("%.2f", valorPagar));
		
		sc.close();
	}

}
