package com.projetos.cursojava;

import java.util.Scanner;

public class ListaExecicios2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		/*
		System.out.println( "Digite o primeiro número: " );
		int numero1 = input.nextInt();
		System.out.println( "Digite o segundo número" );
		int numero2 = input.nextInt();
		
		if ( numero1 > numero2 ){
		
			System.out.println( numero1 + " é maior que o " + numero2);
		}else {
			System.out.println( numero2 + " é maior que o " + numero1 );
		}
		
		
		System.out.println( "Digite qualquer valor positivo ou negativo: " );
		int valor = input.nextInt();
		
		if ( valor == 0 ){
			System.out.println( "O valor digitado é neutro.");
		}else if( valor > 0){
			System.out.println( "O valor digitado é positivo" );
		}else {
			System.out.println( "O valor digitado é negativo." );
		}
	
		System.out.println( "Digite F ou M para saber o genero: ");
		char genero = input.nextLine().charAt(0);
				
		if ( genero == 'f' || genero == 'F' ){
			System.out.println( "O caracter representa o sexo feminino" );
		}else if ( genero == 'm' || genero == 'M' ){
			System.out.println( "O caracter representa o sexo masculino" );
		}else {
			System.out.println( "Caracter inválido!" );
		}
		
		
		System.out.print( "Digite uma letra do alfabeto: " );
		String letra = input.nextLine().toLowerCase();
		
		switch (letra){
			case "a":
				System.out.println( "A letra digitada é vogal." );
				break;
			case "e":
				System.out.println( "A letra digitada é vogal." );
				break;
			case "i":
				System.out.println( "A letra digitada é vogal." );
				break;
			case "o":
				System.out.println( "A letra digitada é vogal." );
				break;
			case "u":
				System.out.println( "A letra digitada é vogal." );
				break;
			default:
				System.out.println( "A letra digitada é consoante." );
				
		}
		
		
		System.out.println( "Digite a primeira nota: ");
		double nota1 = Double.parseDouble(input.next());
		
		System.out.println( "Digite a segunda nota: " );
		double nota2 = Double.parseDouble(input.next());
		
		double mediaFinal = ( nota1 + nota2 ) / 2;
		
		if ( mediaFinal == 10) {
			System.out.println( "Aluno Aprovado com Distinção." );
			
		}else if (mediaFinal >= 7) {
			System.out.println( "Aprovado." );
			
		}else {
			System.out.println( "Reprovado.");
		}
		*/
		
		System.out.print( "Digite o primeiro número: " );
		int numero1 = input.nextInt();
		System.out.print( "Digite o segundo número: " );
		int numero2 = input.nextInt();
		System.out.print( "Digite o terceiro número: " );
		int numero3 = input.nextInt();
		
		if ( numero1 > numero2 & numero1 > numero3 ) {
			System.out.printf( "O %s é o maior número.", numero1 );
		}else if ( numero2 > numero1 & numero2 >numero3) {
			System.out.printf( "O %s é o maior número.", numero2 );
		}else {
			System.out.printf( "O %s é o maior número.", numero3 );
		}
		
		
	}

}
