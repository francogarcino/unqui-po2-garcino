package ar.edu.unq.po2.tp3;

public class Punto {

	public int x;
	public int y;
	
	public Punto(int nx, int ny) {
		this.setX(nx);
		this.setY(ny);
	}
	
	public Punto() {
		this.setX(0);
		this.setY(0);
	}
	
	public void moverPunto(Punto point, int x, int y) {
		point.setX(x);
		point.setY(y);
	}
	
	public Punto sumarPuntos (Punto point1, Punto point2) {
		int sumaX = point1.getX() + point2.getX();
		int sumaY = point1.getY() + point2.getY();
		
		return new Punto(sumaX, sumaY);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int nx) {
		this.x = nx;
	}
	public int getY() {
		return y;
	}
	public void setY(int ny) {
		this.y = ny;
	}
	
	
	
}
