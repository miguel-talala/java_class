package exEstruturaSequencial;

import java.util.Scanner;


public class ExArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double raio;
		System.out.println("Digite um valor de Raio:");
		raio = sc.nextDouble();
		
		CalcularArea CC = new CalcularArea();
		
		double area = CC.calcular(raio);
		
		System.out.printf("Area: %.4f", area);
		
		sc.close();
	}
	
	
	
}
