package ar.edu.unq.po2.tp3;

public class Rectangulo {

	Punto origen;
	int altura;
	int base;
	
	public Rectangulo(Punto recOrigen, int recBase, int recAltura) {
		this.setOrigen(recOrigen);
		this.setAltura(recAltura);
		this.setBase(recBase);
	}
	
	public int area(Rectangulo r) {
		return r.getAltura() * r.getBase();
	}
	
	public int perimetro(Rectangulo r) {
		return 2 * (r.getAltura() + r.getBase());
	}
	
	public boolean esVertical(Rectangulo r) {
		return r.getAltura() > r.getBase();
	}
	
	public boolean esHorizontal(Rectangulo r) {
		return r.getAltura() < r.getBase();
	}

	public Punto getOrigen() {
		return origen;
	}
	public void setOrigen(Punto origen) {
		this.origen = origen;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
}
