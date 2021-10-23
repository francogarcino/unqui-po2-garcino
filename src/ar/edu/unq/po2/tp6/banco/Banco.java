package ar.edu.unq.po2.tp6.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	private List<SolicitudCredito> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudCredito>();
	}

	public void registarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void registrarSolicitud(Cliente cliente, double monto, int meses) {
		SolicitudCredito credito = new CreditoPersonal(cliente, monto, meses); 
		this.solicitudes.add(credito);		
	}

	public void registrarSolicitudHipotecario(Cliente cliente, double monto, int meses, Propiedad garantia) {
		SolicitudCredito credito = new CreditoHipotecario(cliente, monto, meses, garantia); 
		this.solicitudes.add(credito);
	}
	
}
