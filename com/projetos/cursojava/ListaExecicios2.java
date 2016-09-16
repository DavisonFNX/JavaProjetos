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
	*/
		System.out.println( "Digite F ou M para saber o genero: ");
		char genero = input.nextLine().charAt(0);
				
		if ( genero == 'f' || genero == 'F' ){
			System.out.println( "O caracter representa o sexo feminino" );
		}else if ( genero == 'm' || genero == 'M' ){
			System.out.println( "O caracter representa o sexo masculino" );
		}else {
			System.out.println( "Caracter inválido!" );
		}
		
		
		
		
		
		
	}

}
