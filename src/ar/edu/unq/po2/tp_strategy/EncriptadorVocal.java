package ar.edu.unq.po2.tp_strategy;

public class EncriptadorVocal implements EncriptadorGeneral {

	@Override
	public String encriptar(String text) {
		String textoEncriptado = "";
		for (int i = 0; i < text.length(); i++) {
			textoEncriptado += this.encriptarLetra(text.charAt(i));
		}
		
		return textoEncriptado;
	}

	private String encriptarLetra(char charAt) {
		switch (charAt) {
			case 'a': return "e";
			case 'e': return "i";
			case 'i': return "o";
			case 'o': return "u";
			case 'u': return "a";
			default: return ""+charAt;
		}
	}

	@Override
	public String desencriptar(String text) {
		String textoDesencriptado = "";
		for (int i = 0; i < text.length(); i++) {
			textoDesencriptado += desencriptarLetra(text.charAt(i));
		}
		
		return textoDesencriptado;
	}

	private String desencriptarLetra(char charAt) {
		switch (charAt) {
		case 'a': return "u";
		case 'e': return "a";
		case 'i': return "e";
		case 'o': return "i";
		case 'u': return "o";
		default: return ""+charAt;
	}
	}

}
