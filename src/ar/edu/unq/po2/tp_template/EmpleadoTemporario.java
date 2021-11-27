package ar.edu.unq.po2.tp_template;

public class EmpleadoTemporario extends Empleado {

	private boolean estaCasado;
	private int cantHijos;

	public EmpleadoTemporario(boolean estadoCivil, int cantHijos) {
		this.estaCasado = estadoCivil;
		this.cantHijos = cantHijos;
	}
	
	@Override
	protected double sueldoFijo() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public int sueldoPorHora() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	@Override
	public double bono() {
		if (this.estaCasado || cantHijos > 0) {
			return 100;
		} else {
			return 0;
		}
	}

}
