package com.projetos.cursojava;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner( System.in );
		/*
		System.out.println("Digite seu nome completo ");
		String nomeCompleto = input.nextLine();		
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome");
		String primeiroCompleto = input.next();		
		System.out.println("Seu nome completo é: " + primeiroCompleto);
		
		System.out.println("Digite sua idade:");
		int idade = input.nextInt();
		System.out.println("Sua idade é " + idade);
		
		System.out.println("Digite sua altura:");
		double altura = input.nextDouble();
		System.out.println( "Sua altura é " + altura );
	*/
		
		System.out.println( "Didite o seu primeiro nome, idade, quantidade de filhos, altura e se tem chachorro" );
		String primeironome = input.next();
		int idade = input.nextInt();
		byte qtdfilhos = input.nextByte();
		float altura = input.nextFloat();
		boolean tempet = input.nextBoolean();
		
		System.out.println("Voce digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeironome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdfilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem bichoo de estimação?: " + tempet);
	}

}
