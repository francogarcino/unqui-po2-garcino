package ar.edu.unq.po2.enu;

public enum Deporte {

	RUNNING(1), FUTBOL(2), BASQUET(2), TENNIS(3), JABALINA(4);

	Deporte(int nivelComplejidad) {
		this.complejidad = nivelComplejidad;
	}

	public int getComplejidad() {
		return complejidad;
	}

	int complejidad;
	
}
