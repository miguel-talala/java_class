package atribuiçãoAcumulativa;

import java.util.Locale;
import java.util.Scanner;
public class OperadoraTelefonica {
	public static void main(String[] args) {
	
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
	 double conta = 50.0;
	 System.out.println("Inserir quantia de minutos: ");
	 int minutos = sc.nextInt();
	 if (minutos > 100) {
		 conta += (minutos - 100) * 2.0;
	 }
	 System.out.printf("Valor a ser a pago R$%.2f", conta);
	 
	 sc.close();
	}
}
