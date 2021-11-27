package ar.edu.unq.po2.tp6.banco;

public interface SistemaBancario {

	public void registarCliente(Cliente cliente);
	public void registrarSolicitud(Cliente cliente, double monto, int meses);
	public void registrarSolicitudHipotecario(Cliente cliente, double monto, int meses, Propiedad garantia);
	public double montoADesembolsar();
	
}
