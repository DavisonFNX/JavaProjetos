package com.projetos.cursojava;

import java.util.Scanner;

public class ListaExercicios1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Olá Mundo!" );
		
		System.out.print( "Digite um número: " );
		int num = input.nextInt();
		System.out.println( "O número informado foi: " + num );
		
		System.out.print( "Digite dois números aleatórios: " );
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println( "A soma dos valores são: " + ( num1 + num2 ) );
		
		System.out.print( "Digite primeira notas bimestrais: " );
		double nota1 = Double.parseDouble(input.next());
		System.out.print( "Digite segunda notas bimestrais: " );
		double nota2 = Double.parseDouble(input.next());
		System.out.print( "Digite terceira notas bimestrais: " );
		double nota3 = Double.parseDouble(input.next());
		System.out.print( "Digite quarta notas bimestrais: " );
		double nota4 = Double.parseDouble(input.next());
		System.out.println( "A média das notas são: "+ ( ( nota1 + nota2 + nota3 + nota4 ) / 4 ) );
		
		System.out.print( "Digite o valor em metros: " );
		double metros = Double.parseDouble(input.next());
		System.out.println( "A conversão para  centimetros é: " + ( metros * 100 ) );
		
		
		System.out.print( "Digite o raio do circulo: " );
		double circ = Double.parseDouble(input.next());
		double pi = 3.1415;
		System.out.println( "O valor da área desse circulo é: " + ( pi * (circ * circ) ) );
		
		System.out.print( "Digile o lado do quadrado: " );
		double quadrado = Double.parseDouble(input.next());
		System.out.println( "O drobro da área do quadrado é: " + (( quadrado * quadrado ) * 2) );
		
		System.out.print( "Qual o valor da sua hora trabalhada?: " );
		int hora = input.nextInt();
		System.out.print( "Quantas horas vc trabalha por mês?: " );
		int horast = input.nextInt();
		System.out.println( "O valor do seu salário é: " + ( hora * horast ) );
		
		System.out.print( "Forneça a temperatura em Farenheit: " );
		double temp = Double.parseDouble(input.next());
		double Celcio = ( 5 * ( temp - 32) / 9 );
		System.out.println( "A conversão para Grau Celcios é: " + Celcio );
		
		System.out.print( "Digite 2 números inteiros: " );
		int nu1 = input.nextInt();
		int nu2 = input.nextInt();
		System.out.print( "Digite 1 número real: " );
		double nu3 = Double.parseDouble(input.next());
		System.out.printf( "O produto do dobro do primeiro com a metade do segundo é: %d\n ", (( nu1 * 2 ) * ( nu2 / 2 )) );
		System.out.println( "A soma do triplo do primeiro com o terceiro é: " + (( nu1 * 3 ) + nu3) );
		System.out.println( "O terceiro elevado ao cubo é: " + (nu3 * nu3 * nu3)  );
		
		System.out.print( "Digite sua altura: " );
		double altura2= Double.parseDouble(input.next());
		double pesoi = ( 72.7 * altura2 ) - 58;
		System.out.println( "Seu peso ideal seria de: " + pesoi + " kl" );
		
		System.out.print( "Qual o valor da sua hora trabalhada?: " );
		double hora1 = Double.parseDouble(input.next());
		System.out.print( "Quantas horas vc trabalha por mês?: " );
		double horastr = input.nextDouble();
		double salarioBruto = ( hora1 * horastr ); 
		double inss = salarioBruto * 0.08;
		double irfr = salarioBruto * 0.11;
		double sindicato = salarioBruto * 0.05;
		double liquido = salarioBruto - inss - irfr - sindicato;
		System.out.println( "O valor do seu salário bruto é R$ " + salarioBruto );
		System.out.println( "O valor de INSS é R$ " + inss );
		System.out.println( "O valor do sindicato é R$ " + sindicato );
		System.out.println( "O valor salário liquido é R$ " + liquido );
		
		System.out.print( "Forneça o tamanho do arquivo em MB a ser baixado : " );
		double arq = Double.parseDouble(input.next());
		System.out.print( "Qual a velocidade da internet em Mbps : " );
		double vel = Double.parseDouble(input.next());
		
		double kBytes = arq * 1024;
		System.out.println(kBytes);
		
		double tMbits = kBytes / 125;
		System.out.println(tMbits);
		double temConexaoSeg = tMbits /vel;
		
		double tempoTrans = temConexaoSeg / 60;
		
		System.out.println( "O tempo de Transferencia em minutos é: " + tempoTrans );
		
		
		
		
		
		
		
		
		
	}

}
