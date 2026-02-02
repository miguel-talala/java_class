package curso_programacao;

import java.util.Locale;		

public class Main {

	public static void main(String[] args) {
		
		String nome = "Yasmim";
		int idade = 18;
		double renda = 4000.00;
		double x = 10.35784;
		Locale.setDefault(Locale.US);
		System.out.println(x);
		System.out.printf("%.2f%n", x );
		System.out.printf("%.4f%n", x );
		System.out.printf("RESULTADO %.2f METROS%n",x );
		
		
		
		System.out.printf("%s tem %d anos e ganhar R$%.2f reais%n", nome, idade, renda);
	}

}
