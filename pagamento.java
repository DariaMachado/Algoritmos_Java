import java.util.Locale;
import java.util.Scanner;

public class pagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double valorH, pagamento;
		int horas;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		valorH = sc.nextDouble();
		
		System.out.print("Horas trabalhadas: ");
		horas = sc.nextInt();
		
		pagamento = valorH * horas;
		
		System.out.println("O pagamento para " + nome + " deve ser " + String.format("%.2f", pagamento));
		
		sc.close();

	}

}
