package ar.edu.unq.po2.tp6.banco;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private double sueldoNetoAnual;
	
	private Banco banco;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double snm, double sna) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = snm;
		this.sueldoNetoAnual = sna;
	}
	
	public int getEdad() {
		return edad;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void solicitarCredito(double monto, int meses) {
		this.banco.registrarSolicitud(this, monto, meses);
	}
	
	public void solicitarCreditoHipotecario(double monto, int meses, Propiedad garantia) {
		this.banco.registrarSolicitudHipotecario(this, monto, meses, garantia);
	}

	public double getSueldoNetoAnual() {
		return this.sueldoNetoAnual;
	}
	
}
