package ar.edu.unq.po2.tp_template.elementos;

import java.util.List;
import java.util.Map;

public class Page implements WikipediaPage{

	private String titulo;
	private List<WikipediaPage> enlaces;
	private Map<String, WikipediaPage> infobox;
	
	public Page(String title, List<WikipediaPage> enlaces, Map<String, WikipediaPage> infobox) {
		this.titulo = title;
		this.infobox = infobox;
		this.enlaces = enlaces;
	}
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return this.titulo;
	}
	
	@Override
	public List<WikipediaPage> getLinks() {
		// TODO Auto-generated method stub
		return this.enlaces;
	}
	
	@Override
	public Map<String, WikipediaPage> getInfobox() {
		return this.infobox;
	}
	
}
