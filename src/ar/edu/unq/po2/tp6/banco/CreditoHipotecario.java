package ar.edu.unq.po2.tp6.banco;

public class CreditoHipotecario extends SolicitudCredito {

	private Propiedad propiedadDeGarantia;

	public CreditoHipotecario(Cliente cliente, double monto, int meses, Propiedad garantia) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = meses;
		this.propiedadDeGarantia = garantia;
	}

	@Override
	public boolean esAceptable() {
		boolean condition = (this.valorCuota() <= (this.cliente.getSueldoNetoMensual() * 0.5)) &&
							(this.monto <= (this.propiedadDeGarantia.getValorFiscal() * 0.7)) &&
							(65 >= (this.cliente.getEdad() + (this.plazo % 12)));
		return condition;
	}

	

}
