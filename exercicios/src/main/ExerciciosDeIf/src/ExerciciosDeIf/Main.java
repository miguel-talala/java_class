package ExerciciosDeIf;

import java.util.Scanner;


public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.println("Digite 2 numeros ");
		x = sc.nextInt();
		y= sc.nextInt();
		parOuImpar ver = new parOuImpar();
		ver.multiplo(x,y);
		sc.close();
	}
}
