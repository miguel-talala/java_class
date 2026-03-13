package escopoEinicializacao;

import java.util.Scanner;

public class EscopoEInicializacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price = 400.0;
		// escopo, a variavel so é executada quando o metodo é executado, fora isso ela
		// não é reconhecida fora do escopo.
		// para ser usada fora do escopo a variavel precisa ser iniciada(criada e com um
		// valor inicial atribuido).
		double discount;
		if (price < 200.00) {
			discount = price * 0.1;
		}else {
			discount = 0;
		}
		// as variaveis que são criadas dentro de estruturas, sao deletadas assim que o
		// metodo é encerrado.
		System.out.println(discount);

		sc.close();
	}
}
