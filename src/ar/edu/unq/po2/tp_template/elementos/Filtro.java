package ar.edu.unq.po2.tp_template.elementos;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> similarPages = new ArrayList<WikipediaPage>();
		
		for (WikipediaPage maybeSimilarPage : wikipedia) {
			this.aņadirSiEsSimilar(similarPages, page, maybeSimilarPage);
		}
		
		return similarPages;
	}

	protected void aņadirSiEsSimilar(List<WikipediaPage> similarPages, WikipediaPage page, WikipediaPage maybeSimilarPage) {
		if (esSimilar(page, maybeSimilarPage)) {
			similarPages.add(maybeSimilarPage);
		}
	}

	protected abstract boolean esSimilar(WikipediaPage page, WikipediaPage maybeSimilarPage);
	
}
