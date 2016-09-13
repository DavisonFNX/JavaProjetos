package Projeto1;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );
		
		int x; // primeiro número inserido pelo usuário
		int y; // segundo número inserido pelo usuário
		int z; // terceiro número inserido pelo usuário
		int result; // produto dos números
		
		System.out.print( "Entre com o primeiro inteiro: " ); // solicita entrada
		x = input.nextInt(); // lê o primeiro inteiro
		
		System.out.print( "Entre com o segundo inteiro: " ); // solicita entrada
		y = input.nextInt(); // lê o segundo inteiro
		
		System.out.print( "Entre com o terceiro inteiro: " ); // solicita entrada
		z = input.nextInt(); // lê o terceiro inteiro
		
		result = x * y * z; // calcula o produto dos números
		
		System.out.printf( "O produto é %d\n", result );
		

	} // fim do método

} // fim da classe Product
