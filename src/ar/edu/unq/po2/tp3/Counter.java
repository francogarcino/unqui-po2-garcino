package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> numeros = new ArrayList<Integer>();

	public ArrayList<Integer> getList() {
		return numeros;
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
		return (n%m == 0);
	}
	
	public int getNPares() {
		int pares = 0;
		for (int i : this.getList()) {
			pares = pares + unoSi(esPar(i));
		}
		
		return pares;
	}
	
	public int getNImpares() {
		int impares = 0;
		for (int i : this.getList()) {
			impares = impares + unoSi(!esPar(i));
		}
		
		return impares;
	}
	
	public int cantidadDeMultiplosDe(int multiplo) {
		int multiplosVistos = 0;
		for (int i : this.getList()) {
			multiplosVistos = multiplosVistos + unoSi(esMultiplo(i, multiplo));
		}
		
		return multiplosVistos;
	}
	
	public void addNumber(int i) {
		this.numeros.add(i);
	}
	
}
