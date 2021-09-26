package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends ProductosEnVenta {
	
	double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esCuidado, double descuento) {
		/**
		 * El descuento debe ser un numero mayor a 0 y menor a 1
		 */
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPrecioCuidado(esCuidado);
		this.setDescuento(descuento);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		/**
		 * El descuento debe ser un numero mayor a 0 y menor a 1
		 */
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPrecioCuidado(false);
		this.setDescuento(descuento);
	}

	@Override
	public double getPrecio() {
		return this.precio * (1 - this.getDescuento());
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
}
