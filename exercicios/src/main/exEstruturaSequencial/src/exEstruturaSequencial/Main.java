package exEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		
		System.out.println("Digite o valor da altura da casa: ");
		double altura = sc.nextDouble();
		System.out.println("Digite o valor da largura da casa: ");
		double largura = sc.nextDouble();
		System.out.println("Digite o preço por metro quadrado: ");
		double precoM = sc.nextDouble();
		
		double area = altura * largura;
		
		double preco = area * precoM;
		System.out.printf("Area : %.2f%n", area);
		System.out.printf("Preço: %.2f%n", preco);
 
		sc.close();
	} 
}
