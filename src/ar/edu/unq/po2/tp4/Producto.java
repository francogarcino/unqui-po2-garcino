package ar.edu.unq.po2.tp4;

public class Producto extends ProductosEnVenta {

	public Producto(String nombre, double precio, boolean esCuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPrecioCuidado(esCuidado);
	}
	
	public Producto(String nombre, double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPrecioCuidado(false);
	}

	@Override
	public double getPrecio() {
		// se sobreescribe el comportamiento ante el mensaje getPrecio
		return this.precio;
	}
	
}
