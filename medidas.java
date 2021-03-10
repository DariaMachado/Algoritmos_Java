import java.util.Locale;
import java.util.Scanner;

public class medidas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double areaQ, areaTri, areaTra, a, b, c;
		
		System.out.print("Digite a medida A: ");
		a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		c = sc.nextDouble();
		
		areaQ = Math.pow(a, 2);
		areaTri = (a * b) / 2;
		areaTra = (a + b) * c / 2;
		
		System.out.println("AREA DO QUADRADO = " + String.format("%.4f", areaQ));
		System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", areaTri));
		System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", areaTra));

		sc.close();
	}

}
