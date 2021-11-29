package ar.edu.unq.po2.tp_template.elementos;

import java.util.List;

public class FiltroPropiedadEnComun extends Filtro {

	@Override
	protected boolean esSimilar(WikipediaPage page, WikipediaPage maybeSimilarPage) {
		List<WikipediaPage> propiedades = (List<WikipediaPage>) maybeSimilarPage.getInfobox().values();
		
		return propiedades.stream().anyMatch(p -> page.getInfobox().containsValue(p));
	}

}
