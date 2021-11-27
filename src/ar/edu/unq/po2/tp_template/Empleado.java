package ar.edu.unq.po2.tp_template;

public abstract class Empleado {

	protected int cantidadHoras;
	
	public double sueldo() {
		double bruto = (this.bono() + this.sueldoFijo() + (this.sueldoPorHora() * this.cantidadHoras));
		
		return bruto - this.retenciones(bruto);
	}

	public void registrarHoras(int n) {
		this.cantidadHoras += n;
	}
	
	protected abstract double sueldoFijo();

	public abstract int sueldoPorHora();
	
	public double retenciones(double bruto) {
		return bruto * 0.13;
	}

	public double bono() {
		return 0;
	}
	
}
