package com.projetos.cursojava;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

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
		*/
		
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
		
						
		
	System.out.println( "\n\nFim do programa!" );	
	}

}
