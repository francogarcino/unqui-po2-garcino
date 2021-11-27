package ar.edu.unq.po2.tp_template;

public class EmpleadoPlanta extends Empleado {

	private int cantHijos;

	public EmpleadoPlanta(int cantidadHijos) {
		this.cantHijos = cantidadHijos;
	}
	
	@Override
	protected double sueldoFijo() {
		// TODO Auto-generated method stub
		return 3000;
	}

	@Override
	public int sueldoPorHora() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double bono() {
		return 150 * this.cantHijos;
	}

}
