package ar.edu.unq.po2.tp_testing;

public class Carta {

	Valor valor;
	Palo palo;
	
	public Carta(Valor valor, Palo palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public Valor getValor() {
		return this.valor;
	}
	
	public Palo getPalo() {
		return this.palo;
	}
	
}
