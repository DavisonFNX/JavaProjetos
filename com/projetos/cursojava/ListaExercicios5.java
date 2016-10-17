package com.projetos.cursojava;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

import com.sun.media.sound.SimpleSoundbank;

public class ListaExercicios5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		input.useLocale(Locale.US);
		DecimalFormat df = new DecimalFormat("0.##");
		/*
		int[][] matrix = new int [4][4];
		int[] pos = new int [2];
		int maior = 0;
		
		for (int i = 0; i < matrix.length; i ++){
			for (int j = 0; j < matrix[i].length; j++ ){
				System.out.print( "Digite valores inteiros aleatórios: " );
				matrix[i][j] = input.nextInt();
				if (matrix[i][j] > maior){
					maior = matrix[i][j];
					pos[0] = (i);
					pos[1] = (j);
				}
			}			
		}
		
		System.out.println(  "O valor maior da matriz é: " + maior + " na posição " + pos[0] + " : " + pos[1] );
		
		
		int[][] matrix = new int [10][10];
		int[] pos = new int [4];
		int maior = 0;
		int menor = 100;
		
		for (int i = 0; i < matrix.length; i ++){
			if (i == 6){
				maior = 0;
				menor = 100;
				pos[0] = 0;
				pos[1] = 0;
				pos[2] = 0;
				pos[3] = 0;
			}
			for (int j = 0; j < matrix[i].length; j++ ){
				matrix[i][j] = (int)Math.round(Math.random()*9);
				if ( i == 4){
					if (matrix[i][j] > maior){
						maior = matrix[i][j];
						pos[0] = (i);
						pos[1] = (j);
					}
					if (matrix[i][j] < menor ){
						menor = matrix[i][j];
						pos[2] = i;
						pos[3] = j;
					}
				}
				
				if ( i == 6){
										
					if (matrix[i][j] > maior){
						maior = matrix[i][j];
						pos[0] = (i);
						pos[1] = (j);
					}
					if (matrix[i][j] < menor ){
						menor = matrix[i][j];
						pos[2] = i;
						pos[3] = j;
					}
				}
			}
			if (i == 4){
				System.out.println(  "O valor maior da matriz na linha " + i + " é: " + maior + " na posição [" + pos[0] + "]:[" + pos[1] + "]" );
				System.out.println(  "O valor menor da matriz na linha " + i + " é: " + menor + " na posição [" + pos[2] + "]:[" + pos[3] + "]" );
			}
			if (i == 6){
				System.out.println();
				System.out.println(  "O valor maior da matriz na linha " + i + " é: " + maior + " na posição [" + pos[0] + "]:[" + pos[1] + "]" );
				System.out.println(  "O valor menor da matriz na linha " + i + " é: " + menor + " na posição [" + pos[2] + "]:[" + pos[3] + "]" );
			}
		}
		
		
		int[][] matrix = new int [3][3];
		int pares = 0;
		int impares = 0;
		
		for (int i = 0; i < matrix.length; i++ ){
			for (int j = 0; j < matrix[i].length; j++ ){
				System.out.print( "Digite os valores da matriz: " );
				matrix[i][j] = input.nextInt();
				if (matrix[i][j] % 2 == 0){
					pares += 1;
				}else {
					impares += 1;
				}
			}
		}
		System.out.println();
		
		for (int i = 0; i< matrix.length; i++ ){
			for (int j = 0; j < matrix[i].length; j++ ){
				System.out.print( matrix[i][j] +" ");
				
				
			}
			System.out.println();
		}
		System.out.println( "============");
		System.out.println( "Total de pares da matriz: " + pares );
		System.out.println( "Total de impares da matriz: " + impares );
		
		
		String[][] calendar = new String[31][24];
		String token = "A";
		int dia;
		int hora;
		
		do{
			System.out.println( "================================" );
			System.out.println( "Programa Agenda Pessoal" );
			System.out.println();
			System.out.println( "Digite A para acrecentar um compromisso," );
			System.out.println( "L para localizar um compromisso" );
			System.out.println( "ou 0 para sair: ");
			System.out.println( "================================" );
			token = input.next().toUpperCase();
		
		
			switch (token) {
				case "A":
					System.out.print( "Digite o dia do mês para alteração: " );
					dia = input.nextInt();
					System.out.print( "Digite a hora para alterar o comprimisso: " );
					hora = input.nextInt();
					System.out.print( "Digite a tarefa: ");
					calendar[dia][hora] = input.next();				
					System.out.println();
					break;
					
					
				case "L" :
					System.out.print( "Digite o dia do mês: " );
					dia = input.nextInt();
					System.out.println( "Digite a hora: " );
					hora = input.nextInt();
					System.out.println();
					System.out.println( "Tarefa: " + calendar[dia][hora]);
					break;
				case "0":
					token ="0";
					break;
				default:
					System.out.println( "Valor inválido!");
			}			
		
		}while (token != "0");
		
		
		String[][][] calendar = new String[31][12][8];
		String token = "A";
		int mes;
		int dia;
		int hora;
		
		do{
			System.out.println( "================================" );
			System.out.println( "Programa Agenda Pessoal" );
			System.out.println();
			System.out.println( "Digite A para acrecentar um compromisso," );
			System.out.println( "L para localizar um compromisso" );
			System.out.println( "ou 0 para sair: ");
			System.out.println( "================================" );
			token = input.next().toUpperCase();
		
		
			switch (token) {
				case "A":
					System.out.print( "Digite o dia para alteração: " );
					dia = input.nextInt();
					System.out.print( "Digite o mês para a alteração: " );
					mes = input.nextInt();
					System.out.print( "Digite a hora para alterar o comprimisso: " );
					hora = input.nextInt();
					System.out.print( "Digite a tarefa: ");
					calendar[dia][mes][hora] = input.next();				
					System.out.println();
					break;
					
					
				case "L" :
					System.out.print( "Digite o dia: " );
					dia = input.nextInt();
					System.out.print( "Digite o mês: " );
					mes = input.nextInt();
					System.out.print( "Digite a hora: " );
					hora = input.nextInt();
					System.out.println();
					System.out.println( "Tarefa: " + calendar[dia][mes][hora]);
					break;
				case "0":
					token ="0";
					break;
				default:
					System.out.println( "Valor inválido!");
			}			
		
		}while (token != "0");
		*/
		
		String[][] jogoVelha = new String[3][3];
		int numero;
		int cont = 1;
		int token = 1;
		String ganhador = " ";
		
		for (int i = 0; i < jogoVelha.length; i++){
			for (int j = 0; j < jogoVelha.length; j++){
				jogoVelha[i][j] = Integer.toString(cont);
				cont += 1;
			}
		}
		cont = 0;
		do{
			if (cont >= 9){
				token = 0;
				break;
			}
			
			if ( jogoVelha[0][0].equals(jogoVelha[0][1]) && jogoVelha[0][0].equals(jogoVelha[0][2]) ){
				token = 0;
				ganhador = jogoVelha[0][0];
				break;							
			}else if ( jogoVelha[1][0].equals(jogoVelha[1][1]) && jogoVelha[1][0].equals(jogoVelha[1][2]) ){
				token = 0;
				ganhador = jogoVelha[1][0];
				break;				
			}else if ( jogoVelha[2][0].equals(jogoVelha[2][1]) && jogoVelha[2][0].equals(jogoVelha[2][2]) ){
				token = 0;
				ganhador = jogoVelha[2][0];
				break;
				
			}else if (jogoVelha[0][0].equals(jogoVelha[1][0]) && jogoVelha[0][0].equals(jogoVelha[2][0]) ){
				token = 0;
				ganhador = jogoVelha[0][0];
				break;
			}else if (jogoVelha[0][1].equals(jogoVelha[1][1]) && jogoVelha[0][1].equals(jogoVelha[2][1]) ){
				token = 0;
				ganhador = jogoVelha[0][1];
				break;
			}else if (jogoVelha[0][2].equals(jogoVelha[1][2]) && jogoVelha[0][2].equals(jogoVelha[2][2]) ){
				token = 0;
				ganhador = jogoVelha[0][2];
				break;
				
			}else if (jogoVelha[0][0].equals(jogoVelha[1][1]) && jogoVelha[0][0].equals(jogoVelha[2][2]) ){
				token = 0;
				ganhador = jogoVelha[0][0];
				break;
			}else if (jogoVelha[0][2].equals(jogoVelha[1][1]) && jogoVelha[0][2].equals(jogoVelha[2][0]) ){
				token = 0;
				ganhador = jogoVelha[0][2];
				break;
			}
			
			System.out.println( "================");
			System.out.println( "| JOGO DA VELHA |");
			System.out.println( "================");
			System.out.println( "["+ jogoVelha[0][0]+"] | ["+ jogoVelha[0][1]+"] | ["+ jogoVelha[0][2]+"]");
			System.out.println( "["+ jogoVelha[1][0]+"] | ["+ jogoVelha[1][1]+"] | ["+ jogoVelha[1][2]+"]");
			System.out.println( "["+ jogoVelha[2][0]+"] | ["+ jogoVelha[2][1]+"] | ["+ jogoVelha[2][2]+"]");
			System.out.println( "================");
			System.out.println();
			System.out.print( "Escolha um número: ");
			numero = input.nextInt();
			
			switch (numero){
				case 1:
					if (cont >= 9){
						token = 0;
						break;						
					}
					System.out.print( "Escolha O ou X: " );
					jogoVelha[0][0] = input.next().toUpperCase();
					break;
				case 2:
					if (cont >= 9){
						token = 0;
						break;						
					}
					System.out.print( "Escolha O ou X: " );
					jogoVelha[0][1] = input.next().toUpperCase();
					break;
				case 3:
					if (cont >= 9){
						token = 0;
						break;						
					}
					System.out.print( "Escolha O ou X: " );
					jogoVelha[0][2] = input.next().toUpperCase();
					break;
				case 4:
					if (cont >= 9){
						token = 0;
						break;						
					}
					System.out.print( "Escolha O ou X: " );
					jogoVelha[1][0] = input.next().toUpperCase();
					break;
				case 5:
					if (cont >= 9){
						token = 0;
						break;						
					}
					System.out.print( "Escolha O ou X: " );
					jogoVelha[1][1] = input.next().toUpperCase();
					break;
				case 6:
					if (cont >= 9){
						token = 0;
						break;						
					}
					System.out.print( "Escolha O ou X: " );
					jogoVelha[1][2] = input.next().toUpperCase();
					break;
				case 7:
					if (cont >= 9){
						token = 0;
						break;						
					}
					System.out.print( "Escolha O ou X: " );
					jogoVelha[2][0] = input.next().toUpperCase();
					break;
				case 8:
					if (cont > 9){
						token = 0;
						break;						
					}
					System.out.print( "Escolha O ou X: " );
					jogoVelha[2][1] = input.next().toUpperCase();
					break;
				case 9:
					if (cont >= 9){
						token = 0;
						break;						
					}
					System.out.print( "Escolha O ou X: " );
					jogoVelha[2][2] = input.next().toUpperCase();
					break;
				default :
					System.out.println( "Valor inválido !!");
			}
			cont += 1;
			System.out.println(cont);
		}while(token != 0);
		
		System.out.println();
		System.out.println( "================");
		System.out.println( "| JOGO DA VELHA |");
		System.out.println( "================");
		System.out.println( "["+ jogoVelha[0][0]+"] | ["+ jogoVelha[0][1]+"] | ["+ jogoVelha[0][2]+"]");
		System.out.println( "["+ jogoVelha[1][0]+"] | ["+ jogoVelha[1][1]+"] | ["+ jogoVelha[1][2]+"]");
		System.out.println( "["+ jogoVelha[2][0]+"] | ["+ jogoVelha[2][1]+"] | ["+ jogoVelha[2][2]+"]");
		System.out.println( "================");
		System.out.println();
		System.out.println( "O vencedor é o jogador: " + ganhador );
		
		
		
		
	System.out.println( "\nFim do programa!" );	
	}

}
