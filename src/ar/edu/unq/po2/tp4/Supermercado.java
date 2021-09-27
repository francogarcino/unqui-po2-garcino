package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	String nombre;
	String direccion;
	List<ProductosEnVenta> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.setDireccion(direccion);
		this.setNombre(nombre);
		this.productos = new ArrayList<ProductosEnVenta>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public List<ProductosEnVenta> getProductos() {
		return productos;
	}
	
	public int getCantidadDeProductos() {
		return this.getProductos().size();
	}

	public void agregarProducto(ProductosEnVenta producto) {
		this.productos.add(producto);
	}

	public double getPrecioTotal() {
		double total = 0.0;
		for (ProductosEnVenta p : productos) {
			total = total + p.getPrecio();
		}
		
		return total;
	}
	
}
