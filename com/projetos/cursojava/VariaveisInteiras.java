package com.projetos.cursojava;

public class VariaveisInteiras {

	public static void main(String[] args) {
		
		byte idade01 = 20;
		short idade02 = 21;
		int idade03 = 22;
		long idade04 = 23;
		
		System.out.println("Valor da idade01 = " + idade01);
		System.out.println("Valor da idade02 = " + idade02);
		System.out.println("Valor da idade03 = " + idade03);
		System.out.println("Valor da idade04 = " + idade04);
		
		double valorPassagem = 2.20;
		float valorTomate = 3.95f;
		System.out.println("Valor da passagem = " + valorPassagem);
		System.out.println("Valor d tomate = " + valorTomate);
		
		char o = 111;
		char i = 105;
		char interrogacao = 0x00e1;
				
		System.out.println("" +o +i +interrogacao);
		System.out.println(o +i);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println("O valor de verdadeiro é " + verdadeiro);
		System.out.println("O valor de falso é " + falso);
		
		////////////
		
		int pegadinha = 2147483647;
		
		int pegadinha2 = 100;
		
		System.out.println(pegadinha + pegadinha2);
		
		//a variável pegadinha está no tamanho máximo se vc somar com outro valor
		//no java, ele faz com que os valores variem do seu valor máximo (no caso do int) que é
		// -2147483648 a 2147483648. no exemplo acima ele vai subtrair do valor maximo
		// a variavel pegadinha2 ficando o valor -2147483549 (efeito roleta).
		
		/////////////
		
		int decimal = 26;
		int hexadecimal = 0x1a; //começa com 0x
		int octal = 032; //começa com 0
		int binario = 0b11010; // apartir do JDK7
		
		
		//apartir do JDK7
		long cartaoCredito = 1234_5678_3456L;// para melhorar a leitura do codigo underscore( _ )
		long cpf = 101_134_156_68l; 
		float pi = 3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long maxWords = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		/* não se pode usar o underscore em:
		 * colocar perto do ponto = 3_.1415F ou 3._1415F
		 * colocar perto de sufixos = 3.1415_F
		 * antes de numeros = _52 vira caracter
		 * entre decimal simples = 5_2
		 * final de decimal simples = 52_
		 * perto de prefixos hexadecimal = 0_x52 / 0x_52
		 * entre hexadecimal simples = 0x5_2
		 * no final de hexadecimal simples = 0x52_
		 */
		
		
		
		
		
		
		
		

	}

}
