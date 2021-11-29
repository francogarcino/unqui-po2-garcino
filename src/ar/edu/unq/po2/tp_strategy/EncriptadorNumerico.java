package ar.edu.unq.po2.tp_strategy;

import java.util.ArrayList;
import java.util.List;

public class EncriptadorNumerico implements EncriptadorGeneral {

	private List<String> abc;
	
	public EncriptadorNumerico() {
		this.abc = new ArrayList<String>();
		
		abc.add("a"); abc.add("b"); abc.add("c"); abc.add("d"); abc.add("e"); abc.add("f");
		abc.add("g"); abc.add("h"); abc.add("i"); abc.add("j"); abc.add("k"); abc.add("l");
		abc.add("m"); abc.add("n"); abc.add("o"); abc.add("p"); abc.add("q"); abc.add("r");
		abc.add("s"); abc.add("t"); abc.add("u"); abc.add("v"); abc.add("w"); abc.add("x");
		abc.add("y"); abc.add("z"); abc.add(" ");
	}
	
	@Override
	public String encriptar(String text) {
		String textoEncriptado = "";
		for (int i = 0; i < text.length() - 1; i++) {
			textoEncriptado += this.mapeoAValor(text.charAt(i));
			textoEncriptado += ",";
		}
		
		return textoEncriptado += this.mapeoAValor(text.charAt(text.length() - 1));
	}

	private String mapeoAValor(char charAt) {
		return "" + (this.abc.indexOf(""+charAt) + 1);
	}

	@Override
	public String desencriptar(String text) {
		String textoDesencriptado = "";
		String[] keys = text.split(",");
		
		for (String string : keys) {
			textoDesencriptado += this.mapeoALetra(string);
		}
		
		return textoDesencriptado;
	}

	private String mapeoALetra(String string) {
		return this.abc.get(Integer.parseInt(string) - 1);
	}

}
