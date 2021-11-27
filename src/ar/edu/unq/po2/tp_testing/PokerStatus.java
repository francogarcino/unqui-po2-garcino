package ar.edu.unq.po2.tp_testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.function.Function;
import java.util.stream.Collectors;

public class PokerStatus {

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
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

	private boolean esColor(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		return this.toPalos(carta1, carta2, carta3, carta4, carta5).stream().distinct().toList().size() == 1;
	}
	
	private List<Palo> toPalos(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Palo> palos = new ArrayList<Palo>();
		palos.add(carta1.getPalo());
		palos.add(carta2.getPalo());
		palos.add(carta3.getPalo());
		palos.add(carta4.getPalo());
		palos.add(carta5.getPalo());
		
		return palos;
	}

	private boolean esTrio(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Integer> aparicionesValor = this.toValuesOcurrences(carta1, carta2, carta3, carta4, carta5);
		return aparicionesValor.contains(3);
	}

	private boolean esPoker(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Integer> aparicionesValor = this.toValuesOcurrences(carta1, carta2, carta3, carta4, carta5);
		
		return aparicionesValor.contains(4);
	}

	private List<Integer> toValuesOcurrences(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Valor> valores = new ArrayList<Valor>();
		valores.add(carta1.getValor()); valores.add(carta2.getValor()); valores.add(carta3.getValor());
		valores.add(carta4.getValor()); valores.add(carta5.getValor());
		
		List<Integer> ocurrences = new ArrayList<Integer>();
		for (Valor value : valores) {
			ocurrences.add(valores.stream().filter(v -> v == value).toList().size());
		}
		
		return ocurrences;
	}
	
	public Map<String, Integer> countFrequencies(List<String> list) {
        /* Codigo extraido de StackOverflow; el funcionamiento es:
		Crear un hashmap
	 	Por cada string de la lista:
		>> se busca su valor dentro del hashmap (null o n)
		>> se añade al map, ya sea con 1 (si j = null) o con n+1 en caso contrario */
        Map<String, Integer> hm = new HashMap<String, Integer>();
  
        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
  
        return hm;
    }
	
}
