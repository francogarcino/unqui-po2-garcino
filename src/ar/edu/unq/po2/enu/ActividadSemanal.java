package ar.edu.unq.po2.enu;

public class ActividadSemanal {

	DiaDeLaSemana dia;
	String horaInicio;
	int duracion; // expresada en minutos
	Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, String inicio, int duracion, Deporte deporte) {
		this.dia = dia;
		this.horaInicio = inicio;
		this.duracion = duracion;
		this.deporte =deporte;
	}
	
	// ------------------------------------------------------------------
	
	public double costo() {
		return (this.valorPorDia() + this.precioPorComplejidad());
	}

	private double precioPorComplejidad() {
		return (this.getDeporte().getComplejidad() * 200.0);
	}

	private double valorPorDia() {
		if (this.dia == DiaDeLaSemana.LUNES 
				|| this.dia == DiaDeLaSemana.MARTES 
				|| this.dia == DiaDeLaSemana.MIERCOLES) {
			return (this.duracion/60d) * 500.0;
		} else {
			return (this.duracion/60d) * 1000.0;
		}
	}

	// ------------------------------------------------------------------
	
	public boolean esDe(Deporte dep) {
		return this.getDeporte() == dep;
	}

	// ------------------------------------------------------------------
	
	@Override
	public String toString() {
		return ("Deporte: " + this.getDeporte() + " Dia: " + this.dia + " A LAS: " + this.horaInicio + " Duración: " + (this.duracion / 60) + " hora(s)");
	}

	// ------------------------------------------------------------------
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	public DiaDeLaSemana getDia() {
		return dia;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public int getDuracion() {
		return duracion;
	}
	
}
