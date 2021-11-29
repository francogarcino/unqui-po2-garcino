package ar.edu.unq.po2.tp_strategy;

public class EncriptadorNaive {

	private EncriptadorGeneral estrategia;
	
	public EncriptadorNaive(EncriptadorGeneral estrategia) {
		this.estrategia = estrategia;
	}
	
	public void setEstrategia(EncriptadorGeneral estrategia) {
		this.estrategia = estrategia;
	}

	public String encriptar(String text) {
		return estrategia.encriptar(text);
	}

	public String desencriptar(String text) {
		return estrategia.desencriptar(text);
	}
	
}
