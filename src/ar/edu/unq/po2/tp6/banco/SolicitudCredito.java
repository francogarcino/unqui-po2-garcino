package ar.edu.unq.po2.tp6.banco;

public abstract class SolicitudCredito {

	protected Cliente cliente;
	protected double monto;
	protected int plazo;
	
	public abstract boolean esAceptable();
	
	public double valorCuota() {
		return monto/plazo;
	}
	
}
