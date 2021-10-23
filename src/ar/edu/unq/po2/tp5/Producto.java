package ar.edu.unq.po2.tp5;

public abstract class Producto {

	protected double precio;
	
	public void setPrecio(double precioNuevo) {
		this.precio = precioNuevo;
	}
	
	public abstract double getPrecio();
	
}
