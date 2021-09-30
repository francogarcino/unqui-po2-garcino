package ar.edu.unq.po2.enu;

public enum ColorLesion {
	ROJO("Lesion Roja", 1) {
		@Override
		public ColorLesion siguiente() {
			return GRIS;
		}
		
	}, GRIS("Lesion Gris", 2) {
		@Override
		public ColorLesion siguiente() {
			return AMARILLO;
		}
		
	}, AMARILLO("Lesion Amarilla", 3) {
		@Override
		public ColorLesion siguiente() {
			return MIEL;
		}
		
	}, MIEL("Lesion Miel", 4) {
		@Override
		public ColorLesion siguiente() {
			return ROJO;
		}
	};
	
	String descripcion;
	int nivelRiesgo;
	
	ColorLesion(String string, int i) {
		this.descripcion = string;
		this.nivelRiesgo = i;
	}
	
	public abstract ColorLesion siguiente();
	
}
