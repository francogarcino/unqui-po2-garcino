package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja {
	
	public double precioAPagar(List<Producto> productos) {
		double precioTotal = 0;
		for (Producto producto : productos) {
			precioTotal = precioTotal + producto.getPrecio();
		}
		
		return precioTotal;
	}
	
}
