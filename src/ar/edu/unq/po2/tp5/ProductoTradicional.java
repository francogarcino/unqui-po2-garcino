package ar.edu.unq.po2.tp5;

public class ProductoTradicional extends Producto {

	public ProductoTradicional(double precio) {
		this.setPrecio(precio);
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}
	
}
