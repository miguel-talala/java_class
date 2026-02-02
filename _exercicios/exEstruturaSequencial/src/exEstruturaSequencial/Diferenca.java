package exEstruturaSequencial;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 números:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		DiferencaCalcular dif =  new DiferencaCalcular(a,b,c,d);
		int diferenca = dif.calcularDiferença(a, b, c, d);
		
		System.out.println("Diferença = " + diferenca);
		
		sc.close();

	}

}
