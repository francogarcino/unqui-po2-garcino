package ar.edu.unq.po2.enu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgendaSemanal {

	/**
	 * El objetivo de esta clase es el almacenar una colección de Actividades semanales,
	 * la cual será recorrida mediante streams y/o iteraciones
	 * */
	
	private List<ActividadSemanal> actividades;
	
	// ------------------------------------------
	
	public AgendaSemanal() {
		this.actividades = new ArrayList<ActividadSemanal>();
	}
	
	public List<ActividadSemanal> getActividades() {
		return this.actividades;
	}
	
	public void agregarActividad(ActividadSemanal actSem) {
		this.actividades.add(actSem);
	}
	
	// ------------------------------------------
	
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
					).sum() / 60.0;
	}
	
	public ActividadSemanal masBarataDe(Deporte deporte) {
		List<ActividadSemanal> actividades0 = this.getActividades().stream().filter(a -> a.getDeporte() == deporte).toList();
				
		return this.masBarata(actividades0);
	}

	private ActividadSemanal masBarata(List<ActividadSemanal> actividades) {
		ActividadSemanal actividadMasBarata = actividades.get(0);
		for (ActividadSemanal actividadActual : actividades) {
			actividadMasBarata = masBarataEntre(actividadMasBarata, actividadActual);
		}
		
		return actividadMasBarata;
	}

	private ActividadSemanal masBarataEntre(ActividadSemanal actividad1, ActividadSemanal actividad2) {
		if (actividad1.costo() <= actividad2.costo()) {
			return actividad1;
		} else {
			return actividad2;
		}
	}
	
	public Map<Deporte, ActividadSemanal> masBarataPorDeporte() {
		Map<Deporte, ActividadSemanal> mapa = new HashMap<Deporte, ActividadSemanal>();
		
		for (Deporte deporte : Deporte.values()) {
			// HACER SUBTAREA
			if (this.deportesUsados().contains(deporte)) {
				mapa.put(deporte, masBarataDe(deporte));
			}
		}
		
		return mapa;
	}
	
	private List<Deporte> deportesUsados() {
		List<Deporte> deportes = new ArrayList<Deporte>();
		
		for (ActividadSemanal actividad : this.getActividades()) {
			// HACER SUBTAREA
			if (! deportes.contains(actividad.getDeporte())) {
				deportes.add(actividad.deporte);
			}
		}
		
		return deportes;
	}

	public void todasLasActividades() {
		for (ActividadSemanal actividad : this.actividades) {
			System.out.println(actividad);
		}
	}
	
}
