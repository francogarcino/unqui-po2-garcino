package ar.edu.unq.po2.enu;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;

public class AgendaSemanal {

	/**
	 * El objetivo de esta clase es el almacenar una colecci�n de Actividades semanales,
	 * la cual ser� recorrida mediante streams
	 * */
	
	List<ActividadSemanal> actividades;
	
	public AgendaSemanal() {
		this.actividades = new ArrayList<ActividadSemanal>();
	}
	
	public void a�adirActividad(ActividadSemanal actSem) {
		this.actividades.add(actSem);
	}
	
	public List<ActividadSemanal> getActividades() {
		return this.actividades;
	}
	
	/**
	 * Ejercicios de streams
	 * */
	public List<ActividadSemanal> todosLosFutbol() {
		return this.actividades.stream().
				filter(
					a -> a.esDe(Deporte.FUTBOL)
					).toList();
	}
	
	public List<ActividadSemanal> lasDeComplejidad(int complejidadPedida) {
		return this.actividades.stream().
				filter(
					a -> a.getDeporte().getComplejidad() == complejidadPedida
					).toList();
	}
	
	public double horasSemanales() {
		return this.actividades.stream().
				mapToInt(
					a -> a.duracion
					).sum();
	}
	
	/* La actividadSemanal de menor costo para un Deporte (FUTBOL por ejemplo) de
inter�s recibido por par�metro. Si hay m�s de uno con el mismo costo es indistinto
cual devuelve. Devuelve una ActividadSemanal
Se sugiere investigar la funci�n min de streams y el uso del m�todo
Comparator.comparing(). */
	
	
}
