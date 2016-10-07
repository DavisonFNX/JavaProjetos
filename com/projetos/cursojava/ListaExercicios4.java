package com.projetos.cursojava;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ListaExercicios4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		input.useLocale(Locale.US);
		DecimalFormat df = new DecimalFormat("0.##");
		
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
		
		
		int[] inteiros1 = new int [10];
		double soma = 0;
		
		
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite a s 10 números inteiros: ");
			inteiros1[i] = input.nextInt();
			if (inteiros1[i] % 2 != 0){
				soma += inteiros1[i];
			}
		}
		
		System.out.print( "A média dos impares é " + soma / 10);
		
		
		int[] inteiros1 = new int [10];
		double somaImpar = 0;
		double somaPar = 0;
		double somaTotal = 0;
		String totalPar;
		String totalImpar;
		
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite a s 10 números inteiros: ");
			inteiros1[i] = input.nextInt();
			somaTotal += inteiros1[i];
			
			if (inteiros1[i] % 2 != 0.0){
				somaImpar += inteiros1[i];
			}else {
				somaPar += inteiros1[i];
			}
		}
		
		totalImpar = df.format((somaImpar / somaTotal)*100);
		totalPar = df.format((somaPar / somaTotal)*100);
		System.out.println( "A média dos impares é de " + totalImpar + " %.");
		System.out.println( "A média dos pares é de " + totalPar + " %.");
		
		
		int[] inteiros = new int [10];
		int inferior = 0;
		double iguais = 0;
		double superior = 0;
		double total = 0;
		String media;
		int token = 0;
		
		
		for (int i = 0; i< inteiros.length; i++){
			System.out.println( "Digite a s 10 números inteiros: ");
			inteiros[i] = input.nextInt();
			total += inteiros[i];
			
			
			if (inteiros[i] < 15){
				inferior += inteiros[i];
			}else if (inteiros[i] == 15){
				iguais += inteiros[i];
				token += 1;
			}else {
				superior += inteiros[i];
			}
		}
		media = df.format((superior / total)*100);
		System.out.println("A soma de elementos menores que 15 é de " + inferior);
		System.out.println("A quantidade de elementos iguais a 15 são de " + token + " elementos.");
		System.out.println("A média de elementos maiores que 15 são de " + media + "%.");
		
		
		int[] inteiros1 = new int [10];
		int soma = 0;
		
		
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite as idades de 10 pessoas: ");
			inteiros1[i] = input.nextInt();
			if (inteiros1[i] > 35){
				soma += 1;
			}
		}
		
		System.out.println( "A quantidade de pessoas que ultrapassam os 35 anos é " + soma );
		
		
		int[] inteiros1 = new int [10];
		int menor = 200;
		int maior = 0;
		
		
		for (int i = 0; i< inteiros1.length; i++){
			System.out.println( "Digite as idades de 10 pessoas: ");
			inteiros1[i] = input.nextInt();
			
			if (inteiros1[i] > maior ){
				maior = inteiros1[i];
			}
			
			if (inteiros1[i] < menor){
				menor = inteiros1[i];
			}
		}
		
		System.out.println( "A maior idade é " + maior );
		System.out.println( "A menor idade é " + menor );
		
		
		int[] alunos = new int [10];
		double[] result = new double [10];
		double[] nota1 = new double [10];
		double[] nota2 = new double [10];
		
				
		for (int i = 0; i< alunos.length; i++){
			System.out.print( "Digite a primera nota do aluno " + (i +1) + ": " );
			nota1[i] = input.nextInt();
			
			System.out.print( "Digite a segunda nota do aluno " + (i +1) + ": " );
			nota2[i] = input.nextInt();
			
			result[i] = (nota1[i] + nota2[i]) /2;
			
		}
		System.out.println( " " );
		
		for (int j =0; j < alunos.length; j++){
			if(result[j] >= 7){
				System.out.println( "A média do aluno " + (j +1) + " é " + result[j] + ", aluno APROVADO.");
			}else{
				System.out.println( "A média do aluno " + (j +1) + " é " + result[j] + ", aluno REPROVADO.");
			}
			
		}
		
		
		double[] A = new double [20];
				
		System.out.println( "Digite acotação do dolar em real: ");
		double  dollar = input.nextDouble();
		
		for (int i = 0; i< A.length; i++){
			A[i] = dollar *i;			
			System.out.println(A[i]);
		}
		
		
		int[] A = new int [10];
		
		for (int i = 0; i< A.length; i++){
			A[i] = (int)Math.round(Math.random());			
			System.out.print(A[i] + " ");
		}
		
		
		
		double[] A = new double [10];
			
		for (int i = 0; i< A.length; i++){
			System.out.println( "Digite 10 inteiros: ");
			A[i] = input.nextDouble();
			if (A[i] % 2 == 0){	
				
			}else {
				System.out.println( "esse valor é impar.");
				break;
			}
		}
		
		
		
		String number;
		int cont = 0;
		int token = 0;
		System.out.println( "Digite um inteiros: ");
		number = input.next();
		char[] number3  = new char[number.length()];
		char[] A = new char [number.length()];
		
		for (int i = 0; i< number.length(); i++){
			number3[i] = number.charAt(i);
			//System.out.println(number3[i]);
		}
		
		for (int j = number.length(); j > 0; j--){
			A[cont] = number3[j -1];
			//System.out.println(A[cont]);
			cont++;
		}
		
		for (int i =0; i < number.length(); i++){
			if (A[i] != number3[i]){
				token =1;
				break;
			}
		}
		if (token == 1){
			System.out.println(number + " não é palindromo.");
		}else{
			System.out.println(number + " é palindromo.");
		}
		
		
		int[] A = new int [10];
		int[] B = new int [10];
		
		for (int i = 0; i< A.length; i++){
			System.out.print( "Digite 10 inteiros: ");
			A[i] = input.nextInt();
			if (A[i] % 2 == 0){	
				B[i] = 1;
			}else {
				B[i] = 0;				
			}
		}
		
		for (int j = 0; j < A.length; j++){
			System.out.print(A[j]);
		}
		System.out.println( " " );
		for (int j = 0; j < A.length; j++){
			System.out.print(B[j]);
		}
		
		
		int[] A = new int [10];
		int[] B = new int [10];
		int[] C = new int [10];
		
		for (int i = 0; i < A.length; i++ ){
			System.out.print( "Digite 10 inteiros da lista1: ");
			A[i] = input.nextInt();
		}
		System.out.println("=========================");
		
		for (int i = 0; i< A.length; i++){
			System.out.print( "Digite 10 inteiros da lista2: ");
			B[i] = input.nextInt();
			if (A[i] > B[i]){	
				C[i] = 1;
			}else if(A[i] == B[i]) {
				C[i] = 0;				
			}else {
				C[i] = -1;
			}
		}
		
		for (int j = 0; j < A.length; j++){
			System.out.print(A[j] + " ");
		}
		System.out.println( " " );
		for (int j = 0; j < A.length; j++){
			System.out.print(B[j] + " ");
		}
		System.out.println( " " );
		for (int j = 0; j < A.length; j++){
			System.out.print(C[j] + " ");
		}
		
		
		int[] A = new int [10];
		char[] B = new char [10];
		
					
		for (int i = 0; i< A.length; i++){
			System.out.print( "Digite 10 inteiros para lista: ");
			A[i] = input.nextInt();
			switch (A[i]){
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					B[i] = 'a';
					break;
				case 7:
					B[i] = 'b';
					break;
				case 8:
				case 9:
					B[i] = 'c';
					break;
				case 10:
					B[i] = 'd';
					break;
				default:
					B[i] = 'e';					
			}
			
		}
		
		for (int j = 0; j < A.length; j++){
			System.out.print(B[j] + " ");
		}
		
		
		int cont = 0;
		int[] number  = new int[10];
		int[] A = new int [10];
		
		for (int i = 0; i< A.length; i++ ){
			System.out.println( "Digite um inteiros: ");
			number[i] = input.nextInt();
		}
		
		for (int j = 9; j >= 0; j--){
			A[cont] = number[j];
			cont++;
		}
		
		for (int i =0; i < 10; i++){
			System.out.print(A[i] + " ");
		}
		
		
		int[] A = new int [10];
		int[] B = new int [10];
		int[] C = new int [20];
		
		for (int i = 0; i < A.length; i ++){
			System.out.print( "Digite os 10 elementos da lista1: " );
			A[i] = input.nextInt();
			C[i] = A[i];
		}
		
		for (int j = 0; j < B.length; j ++){
			System.out.print( "Digite os 10 elementos da lista2: " );
			B[j] = input.nextInt();
			C[j + 10] = B[j];
		}
		System.out.println( "================" );
		
		for (int i = 0; i < C.length; i++){
			System.out.print(C[i] + " ");
		}
		
		
		int[] A = new int [20];
		int[] B = new int [20];
		int[] C = new int [20];
		
		for (int i = 0; i < A.length; i ++){
			System.out.print( "Digite os 10 elementos da lista1: " );
			A[i] = input.nextInt();
			
			if (A[i] % 2 == 0){
				C[i] = A[i];
			}else{
				B[i] = A[i];
			}
			
		}
		
		
		System.out.println( "================" );
		
		System.out.print("Números pares: ");
		for (int i = 0; i < A.length; i++){
			if (C[i] != 0){
				System.out.print(C[i] + " ");
			}
		}
		System.out.println( " " );
		System.out.print("Números impares: ");
		for (int i = 0; i < A.length; i++){
			if (B[i] != 0){
				System.out.print(B[i] + " ");
			}
		}
		
		
		int[] A = new int [20];
		int[] B = new int [20];
		int token = 0;
				
		for (int i = 0; i < A.length; i ++){
			System.out.print( "Digite os 20 elementos da lista1: " );
			A[i] = input.nextInt();
			
			if (A[i] % 2 == 0){
				B[token] = A[i];
				token ++;
			}			
		}
		
		for (int i = 0; i < A.length; i ++){
			if (A[i] % 2 != 0){
				B[token] = A[i];
				token ++;
			}
		}
				
		System.out.println( "================" );
		
		for (int i = 0; i < A.length; i++){
			System.out.print(B[i] + " " );			
		}
		*/
		
		int cont = 0;
		int[] tabuada  = new int[5];
		
		
		for (int i = 0; i < tabuada.length; i++ ){
			System.out.print( "Digite 5 inteiros: ");
			tabuada[i] = input.nextInt();
		}
		System.out.println( "===============");
		for (int conta: tabuada){
			for (int i = 0; i <= 10; i ++ ){
				System.out.println(conta + " x " + i + " = "+ (conta * i));
			}
			System.out.println( "===============");
			System.out.println( " ");
		}
				
		
		
		 
		
		
		
	System.out.println( "\n\nFim do programa!" );	
	}

}
