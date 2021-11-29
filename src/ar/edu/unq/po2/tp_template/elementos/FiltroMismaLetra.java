package ar.edu.unq.po2.tp_template.elementos;

public class FiltroMismaLetra extends Filtro {

	@Override
	protected boolean esSimilar(WikipediaPage page, WikipediaPage maybeSimilarPage) {
		return maybeSimilarPage.getTitle().startsWith(
			page.getTitle().substring(0, 0)	
		);
	}

}
