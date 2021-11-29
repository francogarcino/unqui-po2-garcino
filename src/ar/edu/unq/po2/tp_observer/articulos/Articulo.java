package ar.edu.unq.po2.tp_observer.articulos;

import java.util.List;
import java.util.Map;

public class Articulo {

	private String titulo;
	private Map<String, List<String>> autoresConAfilicaciones;
	private String tipo;
	private String lugarDePublicación;
	private List<String> palabrasClaves;
	
	public List<String> getKeywords() {
		return this.palabrasClaves;
	}
	
}
