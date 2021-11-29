package ar.edu.unq.po2.tp_template.elementos;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {

	public String getTitle();
	public List<WikipediaPage> getLinks();
	public Map<String, WikipediaPage> getInfobox();
	
}
