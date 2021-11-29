package ar.edu.unq.po2.tp_observer.articulos;

import java.util.List;

public class Investigador {

	private List<String> temasDeInteres;
	
	public void nuevoArticuloRegistrado(Articulo articulo) {
		if (esArticuloRelevante(articulo)) {
			/* Implementación del comportamiento de los observadores al recibir una notificación de un articulo nuevo */			
		}
	}

	private boolean esArticuloRelevante(Articulo articulo) {
		int i = 0;
		while (i < articulo.getKeywords().size() && !temasDeInteres.contains(articulo.getKeywords().get(i))) {
			i++;
		}
		return i < articulo.getKeywords().size();
	}
	
}
