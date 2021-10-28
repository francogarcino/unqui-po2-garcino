package ar.edu.unq.po2.tp_testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerStatus {

	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		if (this.esPoker(carta1, carta2, carta3, carta4, carta5)) {
			return "Poker";
		} else if (this.esTrio(carta1, carta2, carta3, carta4, carta5)) {
			return "Trio";
		} else if (this.esColor(carta1, carta2, carta3, carta4, carta5)) {
			return "Color";
		} else {
			return "Nada";
		}
	}

	private boolean esColor(String carta1, String carta2, String carta3, String carta4, String carta5) {
		return this.toPalos(carta1, carta2, carta3, carta4, carta5).stream().distinct().toList().size() == 1;
	}
	
	private List<String> toPalos(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List<String> palos = new ArrayList<String>();
		palos.add(this.paloCarta(carta1));
		palos.add(this.paloCarta(carta2));
		palos.add(this.paloCarta(carta3));
		palos.add(this.paloCarta(carta4));
		palos.add(this.paloCarta(carta5));
		
		return palos;
	}

	private String paloCarta(String carta) {
		return carta.substring(carta.length() - 1, carta.length());
	}

	private boolean esTrio(String carta1, String carta2, String carta3, String carta4, String carta5) {
		Map<String, Integer> aparicionesValor = this.countFrequencies(this.toValues(carta1, carta2, carta3, carta4, carta5));
		return aparicionesValor.containsValue(3);
	}

	private boolean esPoker(String carta1, String carta2, String carta3, String carta4, String carta5) {
		Map<String, Integer> aparicionesValor = this.countFrequencies(this.toValues(carta1, carta2, carta3, carta4, carta5));
		return aparicionesValor.containsValue(4);
	}

	private List<String> toValues(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List<String> valores = new ArrayList<String>();
		valores.add(this.valorCarta(carta1));
		valores.add(this.valorCarta(carta2));
		valores.add(this.valorCarta(carta3));
		valores.add(this.valorCarta(carta4));
		valores.add(this.valorCarta(carta5));
		
		return valores;
	}

	private String valorCarta(String carta) {
		return carta.substring(0, carta.length() - 1);
	}
	
	public Map<String, Integer> countFrequencies(List<String> list) {
        // Codigo extraido de StackOverflow; el funcionamiento es:
		// Crear un hashmap
		// Por cada string de la lista:
		// >> se busca su valor dentro del hashmap (null o n)
		// >> se añade al map, ya sea con 1 (si j = null) o con n+1 en caso contrario
        Map<String, Integer> hm = new HashMap<String, Integer>();
  
        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
  
        return hm;
    }
	
	
}
