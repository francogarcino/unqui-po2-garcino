package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	String nombre;
	String direccion;
	ArrayList<ProductosEnVenta> productos = new ArrayList<ProductosEnVenta>();
	
	public Supermercado(String nombre, String direccion) {
		this.setDireccion(direccion);
		this.setNombre(nombre);
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
	public ArrayList<ProductosEnVenta> getProductos() {
		return productos;
	}
	
	public int getCantidadDeProductos() {
		return this.getProductos().size();
	}

	public void agregarProducto(ProductosEnVenta producto) {
		this.productos.add(producto);
	}

	public double getPrecioTotal() {
		double s = 0.0;
		for (ProductosEnVenta p : productos) {
			s = s + p.getPrecio();
		}
		
		return s;
	}
	
}
