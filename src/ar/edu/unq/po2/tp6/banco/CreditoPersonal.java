package ar.edu.unq.po2.tp6.banco;

public class CreditoPersonal extends SolicitudCredito {
	
	public CreditoPersonal(Cliente cliente, double monto, int meses) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = meses;
	}

	@Override
	public boolean esAceptable() {
		boolean condition = (this.valorCuota() <= (this.cliente.getSueldoNetoMensual() * 0.7)) &&
							(15000.0 <= this.cliente.getSueldoNetoAnual());
		return condition;
	}

}
