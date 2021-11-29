package ar.edu.unq.po2.tp_template.elementos;

public class FiltroLinkEnComun extends Filtro{

	@Override
	protected boolean esSimilar(WikipediaPage page, WikipediaPage maybeSimilarPage) {
		return maybeSimilarPage.getLinks().stream().anyMatch(l -> page.getLinks().contains(l));
	}

}
