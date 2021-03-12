import java.util.Scanner;

public class soma_impares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, i, maior, soma = 0;
		
		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x > y) {
			maior = x;
			x = y;
			y = maior;
		}
		
		for(i = x + 1; i < y; i++) {
			if(i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println("SOMA DOS IMPARES = " + soma);
		
		sc.close();
	}
}
