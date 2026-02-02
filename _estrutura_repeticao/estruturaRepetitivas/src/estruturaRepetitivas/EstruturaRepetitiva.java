package estruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int senhaCorreta = 2002;
		System.out.println("Digite a senha de acesso: ");
		int senhaDigitada = sc.nextInt();
		while (senhaDigitada != senhaCorreta) {
			System.out.println("Senha invalida");
			senhaDigitada = sc.nextInt();
		}
		System.out.println("Acesso permitido");

		/*
		 * int x = 5; int y = 0;
		 * 
		 * while (x > 2 ) { System.out.println(x); y = y + x ; x = x - 1;
		 * 
		 * } /*System.out.println("Digite um numero: "); int numero = sc.nextInt(); int
		 * soma = 0; while (numero != 0) { soma += numero; numero = sc.nextInt();
		 * 
		 * } System.out.println(soma);
		 * 
		 */
		sc.close();
	}

}
