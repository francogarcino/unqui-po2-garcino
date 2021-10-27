package ar.edu.unq.po2.tp_testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerStatus {

	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List<String> cartas = this.toValues(carta1, carta2, carta3, carta4, carta5);
		
		return this.countFrequencies(cartas).containsValue(4);
	}

	public List<String> toValues(String carta1, String carta2, String carta3, String carta4, String carta5) {
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
