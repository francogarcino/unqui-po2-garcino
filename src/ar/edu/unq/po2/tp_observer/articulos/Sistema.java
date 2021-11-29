package ar.edu.unq.po2.tp_observer.articulos;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private List<Articulo> articulos;
	private List<Investigador> observers;
	
	public Sistema() {
		articulos = new ArrayList<Articulo>();
		observers= new ArrayList<Investigador>();
	}
	
	public void registrarSuscripción(Investigador investigador) {
		this.observers.add(investigador);
	}
	
	public void eliminarSuscripción(Investigador investigador) {
		this.observers.remove(investigador);
	}
	
	public void registrarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
		
		for (Investigador investigador : observers) {
			investigador.nuevoArticuloRegistrado(articulo);
		}
	}
	
}
