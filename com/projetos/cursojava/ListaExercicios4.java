package com.projetos.cursojava;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ListaExercicios4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		input.useLocale(Locale.US);
		/*
		
		int[] elementos = new int [5];
		int[] elementos2 = new int [5];
				
		for (int i = 0; i< elementos.length; i++){
			System.out.println( "Digite a s 5 temperaturas: ");
			elementos[i] = input.nextInt();
		}
		System.out.print( "Temperaturas: ");
		for (int temperaturas : elementos){
			System.out.print(temperaturas + "º ");
		}		
		
		for (int j = 0; j < elementos.length; j++){
			elementos2[j] = elementos[j];
		}
		System.out.println( " ");
		System.out.print( "Temperaturas2: ");
		for (int i = 0; i < elementos2.length; i++){
			System.out.print(elementos2[i] + "º ");
		}
		
		
		int[] inteiros1 = new int [8];
		int[] inteiros2 = new int [8];
				
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite a s 8 números inteiros: ");
			inteiros1[i] = input.nextInt();
		}
		
		System.out.print( "Lista 1: ");
		for (int lista1 : inteiros1){
			System.out.print(lista1 + " ");
		}		
		
		for (int j = 0; j < inteiros2.length; j++){
			inteiros2[j] = inteiros1[j] * 2;
		}
		System.out.println( " ");
		System.out.print( "Lista2: ");
		for (int i = 0; i < inteiros2.length; i++){
			System.out.print(inteiros2[i] + " ");
		
		
		}
		
		
		int[] inteiros1 = new int [15];
		double[] inteiros2 = new double [15];
		String teste;
		DecimalFormat df = new DecimalFormat("0.##");
				
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite 15 números inteiros: ");
			inteiros1[i] = input.nextInt();
		}
		
		System.out.print( "Lista 1: ");
		for (int lista1 : inteiros1){
			System.out.print(lista1 + " ");
		}		
		
		for (int j = 0; j < inteiros2.length; j++){
			inteiros2[j] = Math.pow(inteiros1[j], 2) ;
		}
		System.out.println( " ");
		System.out.print( "Lista2: ");
		for (int i = 0; i < inteiros2.length; i++){
			teste = df.format(inteiros2[i]);
			System.out.print(teste + " ");
		
		
		}
		
		
		
		int[] inteiros1 = new int [10];
		int[] inteiros2 = new int [10];
				
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite a s 10 números inteiros: ");
			inteiros1[i] = input.nextInt();
		}
		
		System.out.print( "Lista 1: ");
		for (int lista1 : inteiros1){
			System.out.print(lista1 + " ");
		}		
		
		for (int j = 0; j < inteiros2.length; j++){
			inteiros2[j] = inteiros1[j] * j;
		}
		System.out.println( " ");
		System.out.print( "Lista2: ");
		for (int i = 0; i < inteiros2.length; i++){
			System.out.print(inteiros2[i] + " ");
		
		
		} 
		
		
		
		int[] inteiros1 = new int [10];
		int[] inteiros2 = new int [10];
		int[] inteiros3 = new int [10];
				
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite a s 10 números inteiros: ");
			inteiros1[i] = input.nextInt();
		}
		
		System.out.print( "Lista 1: ");
		for (int lista1 : inteiros1){
			System.out.print(lista1 + " ");
		}		
		
		for (int j = 0; j < inteiros2.length; j++){
			inteiros2[j] = inteiros1[j];
			inteiros3[j] = inteiros1[j] + inteiros2[j];
		}
		System.out.println( " ");
		System.out.print( "Lista2: ");
		for (int i = 0; i < inteiros3.length; i++){
			System.out.print(inteiros3[i] + " ");
		
		
		}
		
		
		
		int[] inteiros1 = new int [10];
		int[] inteiros2 = new int [10];
		int[] inteiros3 = new int [10];
				
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite a s 10 números inteiros: ");
			inteiros1[i] = input.nextInt();
			inteiros2[i] = inteiros1[i];
		}
		
		System.out.print( "Lista 1: ");
		for (int lista1 : inteiros1){
			System.out.print(lista1 + " ");
		}		
		
		for (int j = 0; j < inteiros3.length; j++){
			
			inteiros3[j] = inteiros1[j] - inteiros2[j];
		}
		System.out.println( " ");
		System.out.print( "Lista2: ");
		for (int i = 0; i < inteiros3.length; i++){
			System.out.print(inteiros3[i] + " ");
		
		
		}
		
		
		
		int[] inteiros1 = new int [10];
		int[] inteiros2 = new int [10];
		int[] inteiros3 = new int [10];
				
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite a s 10 números inteiros: ");
			inteiros1[i] = input.nextInt();
			inteiros2[i] = inteiros1[i];
		}
		
		System.out.print( "Lista 1: ");
		for (int lista1 : inteiros1){
			System.out.print(lista1 + " ");
		}		
		
		for (int j = 0; j < inteiros3.length; j++){
			
			inteiros3[j] = inteiros1[j] * inteiros2[j];
		}
		System.out.println( " ");
		System.out.print( "Lista2: ");
		for (int i = 0; i < inteiros3.length; i++){
			System.out.print(inteiros3[i] + " ");
		
		
		}
		
		
		int[] inteiros1 = new int [10];
		int[] inteiros2 = new int [10];
		int[] inteiros3 = new int [10];
				
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite a s 10 números inteiros: ");
			inteiros1[i] = input.nextInt();
			inteiros2[i] = inteiros1[i];
		}
		
		System.out.print( "Lista 1: ");
		for (int lista1 : inteiros1){
			System.out.print(lista1 + " ");
		}		
		
		for (int j = 0; j < inteiros3.length; j++){
			
			inteiros3[j] = inteiros1[j] / inteiros2[j];
		}
		System.out.println( " ");
		System.out.print( "Lista2: ");
		for (int i = 0; i < inteiros3.length; i++){
			System.out.print(inteiros3[i] + " ");
		
		
		}
		
		int[] inteiros1 = new int [10];
		int[] inteiros2 = new int [10];
						
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite a s 10 números inteiros: ");
			inteiros1[i] = input.nextInt();
			
		}
		
		System.out.print( "Lista 1: ");
		for (int lista1 : inteiros1){
			System.out.print(lista1 + " ");
		}		
		
		for (int j = 0; j < inteiros2.length; j++){
			
			inteiros2[j] = inteiros1[j] % 2;
		}
		System.out.println( " ");
		System.out.print( "Lista2: ");
		for (int i = 0; i < inteiros2.length; i++){
			System.out.print(inteiros2[i] + " ");
		
		
		}
		
		
		int[] inteiros1 = new int [10];
		
				
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite a s 10 números inteiros: ");
			inteiros1[i] = input.nextInt();
		}
		
		System.out.print( "Lista 1: ");
		for (int lista1 : inteiros1){
			if (lista1 % 2 == 0){
				System.out.println(lista1 + " é par.");
			}else {
				System.out.println(lista1 + " é impar.");
			}
		}
		
		
		int[] inteiros1 = new int [10];
		int soma =0;
		
		
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite a s 10 números inteiros: ");
			inteiros1[i] = input.nextInt();
			soma += inteiros1[i];
		}
		
		System.out.print( "A soma é " + soma);
		*/	
		
		int[] inteiros1 = new int [10];
		int soma =0;
		
		
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite a s 10 números inteiros: ");
			inteiros1[i] = input.nextInt();
			soma += inteiros1[i];
		}
		if (soma % 5 == 0){
			System.out.print(soma + " é multiplo de 5.");
		}else {
			System.out.println(soma + " não é múltiplo de 5.");
		}
		
		
		
		
		
		
		
	System.out.println( "\n\nFim do programa!" );	
	}

}
