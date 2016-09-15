package com.projetos.cursojava;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Digite 2 números inteiros: " );
		int nu1 = input.nextInt();
		int nu2 = input.nextInt();
		System.out.print( "Digite 1 número real: " );
		double nu3 = Double.parseDouble(input.next());
		System.out.printf( "O produto do dobro do primeiro com a metade do segundo é: %d\n ", (( nu1 * 2 ) * ( nu2 / 2 )) );
		System.out.println( "A soma do triplo do primeiro com o terceiro é: " + (( nu1 * 3 ) + nu3) );
		System.out.println( "O terceiro elevado ao cubo é: " + (nu3 * nu3 * nu3)  );
		

	}

}
