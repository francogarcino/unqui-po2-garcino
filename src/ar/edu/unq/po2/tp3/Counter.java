package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> list;

	public ArrayList<Integer> getList() {
		return list;
	}
	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}
	
	public int unoSi(boolean condition) {
		if (condition) {
			return 1;
		} else {
			return 0;
		}
	}
	public boolean esPar(int n) {
		return n % 2 == 0;
	}
	public boolean esMultiplo(int n, int m) {
		if (n%m == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getEvenOcurrences() {
		int evenNumbers = 0;
		for (int i : this.getList()) {
			evenNumbers = evenNumbers + unoSi(esPar(i));
		}
		
		return evenNumbers;
	}
	
	public int getOddOcurrences() {
		int oddNumbers = 0;
		for (int i : this.getList()) {
			oddNumbers = oddNumbers + unoSi(!esPar(i));
		}
		
		return oddNumbers;
	}
	
	public int cantidadDeMultiplosDe(int multiplo) {
		int multiplosVistos = 0;
		for (int i : this.getList()) {
			multiplosVistos = multiplosVistos + unoSi(esMultiplo(i, multiplo));
		}
		
		return multiplosVistos;
	}
}
