package ar.edu.unq.po2.tp4;

public abstract class ProductosEnVenta {

	String nombre;
	double precio;
	boolean precioCuidado;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// metodo a definir en cada subclase
	public abstract double getPrecio();
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
	
	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		this.setPrecio(this.precio + aumento);
	}
	
}
