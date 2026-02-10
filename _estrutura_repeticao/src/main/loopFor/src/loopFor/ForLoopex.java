package loopFor;

import java.util.Scanner;

public class ForLoopex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantia de numeros que serão lidos");
		int x = sc.nextInt();
		int Nin = 0;
		int Nout= 0;
		for(int i = 1; i <= x; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			if( num>= 10 && num <=20) {
		
				Nin++;
			}else {
				Nout++;
			}
		}
		System.out.printf("%d in %n", Nin);
		System.out.printf("%d out %n", Nout);
		sc.close();
	}
}
/*for(int i = 1; i <=x ; i ++) {
if( i % 2 != 0) {
	System.out.println(i);
}*/