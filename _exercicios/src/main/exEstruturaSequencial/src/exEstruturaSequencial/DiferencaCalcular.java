package exEstruturaSequencial;

public class DiferencaCalcular {
private int a;
private int b;
private int c;
private int d;

	public DiferencaCalcular(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public int calcularDiferença(int a, int b, int c, int d) {
		return (a * b) - (c * d);
	}
	
}
