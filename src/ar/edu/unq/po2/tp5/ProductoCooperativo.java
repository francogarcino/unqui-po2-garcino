package ar.edu.unq.po2.tp5;

public class ProductoCooperativo extends Producto {

	public ProductoCooperativo(double precio) {
		this.setPrecio(precio);
	}

	@Override
	public double getPrecio() {
		return this.precio * 0.9;
	}
	
}
