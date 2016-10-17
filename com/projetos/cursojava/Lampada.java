package com.projetos.cursojava;

public class Lampada {
	
	String tipo;
	String potencia;
	String voltagem;
	String frequencia;
	
	int ligado;
	
	boolean acender(int status){
		ligado = status;
		if (ligado == 1){
			return true; 
		}
		return false;
	}
	
	
	
}
