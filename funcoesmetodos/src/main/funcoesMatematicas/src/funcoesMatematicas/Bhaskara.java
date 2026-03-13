package funcoesMatematicas;

public class Bhaskara{
	private double a;
	private double b;
	private double c;
	
	public Bhaskara(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double calcularDelta() {
		return b * b - 4 * a * c ;
		
	}
	
	public double calcularRaiz1() {
		double delta = calcularDelta();
		return(-b + Math.sqrt(delta)) / (2 * a );
	}
	
	public double calcularRaiz2() {
		double delta = calcularDelta();
		return(-b - Math.sqrt(delta) ) / (2 * a );
	}
	
}
