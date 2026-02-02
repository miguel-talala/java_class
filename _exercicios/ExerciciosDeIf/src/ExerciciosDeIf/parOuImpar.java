package ExerciciosDeIf;

public class parOuImpar {
	public void verificador(int x ) {
	 if(x % 2 == 0) {
		 System.out.println("PAR");
	 }
	 else{
		 System.out.println("IMPAR");
	 }
	}

	public void multiplo(int x, int y) {
		if( x % y == 0 || y % x ==0) {
			System.out.println("è multiplo saporra");
		}else {
			System.out.println("Não é multiplo");
		}
	}
}
