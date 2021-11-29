package ar.edu.unq.po2.tp_state;

public class MaquinaArcade {

	private int fichas;
	private EstadoArcade estado;
	
	public MaquinaArcade() {
		resetearMaquina();
	}
	
	public void botonInicioPulsado() {
		this.estado.inicio();
	}
	
	public void ingresaFicha() {
		this.fichas++;
		if (this.fichas == 1) {
			this.setEstado(new Estado1Jugador());
			this.mostrarMensaje("Ingrese otra ficha o presione el boton para iniciar el juego");
		} else if (this.fichas == 2) {
			this.mostrarMensaje("Presione el boton para iniciar el juego");
			this.setEstado(new Estado2Jugadores());
		} else {
			this.mostrarMensaje("Demasiadas fichas ingresadas");
		}
	}
	
	public void gameOver() {
		this.mostrarMensaje("Juego terminado");
		resetearMaquina();
	}

	private void resetearMaquina() {
		this.fichas = 0;
		this.estado = new EstadoEsperandoFichas();
	}
	
	private void mostrarMensaje(String string) {
		System.out.println(string);
	}

	private void setEstado(EstadoArcade estado) {
		this.estado = estado;
	}
	
}
