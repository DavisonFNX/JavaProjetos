package com.projetos.cursojava;

import java.text.DecimalFormat;
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
		System.out.println("");
		
		if ( numero1 < numero2 & numero1 < numero3 ) {
			System.out.printf( "O %s é o menor número.", numero1 );
		}else if ( numero2 < numero1 & numero2 < numero3) {
			System.out.printf( "O %s é o menor número.", numero2 );
		}else {
			System.out.printf( "O %s é o menor número.", numero3 );
		}
		
		
		System.out.print( "Qual o preço do kg do feijão?: " );
		int feijao = input.nextInt();
		System.out.print( "Qual o preço do kg do tomate?: " );
		int tomate = input.nextInt();
		System.out.print( "Qual o preço do kg da batata inglesa? " );
		int batata = input.nextInt();
		
		if ( feijao < tomate & feijao < batata ) {
			System.out.print( "O kg do feião é o mais barato.");
		}else if ( tomate < feijao & tomate < batata ) {
			System.out.print( "O kg do tomate é o mais barato" );
		}else {
			System.out.printf( "O kg da batata inglesa é a mais barata" );
		}
		
		System.out.println( "Digite 3 números direfentes!");
		System.out.print( "Digite o primeiro número: " );
		int nume1 = input.nextInt();
		System.out.print( "Digite o segundo número: " );
		int nume2 = input.nextInt();
		System.out.print( "Digite o terceiro número: " );
		int nume3 = input.nextInt();
		
		if ( nume1 > nume2 & nume1 > nume3 & nume2 > nume3 ) {
				System.out.print( "Os valores decrescente são: " + nume1 + " " + nume2 +" "+ nume3 );
		}
		
		if ( nume1 > nume2 & nume1 > nume3 & nume2 < nume3 ) {
			System.out.print( "Os valores decrescente são: " + nume1 +" "+ nume3 +" "+ nume2 );
		}
		
		if ( nume1 < nume2 & nume1 > nume3 & nume2 > nume3 ) {
			System.out.print( "Os valores decrescente são: " + nume2 +" "+ nume1 +" "+ nume3 );
		}
		
		if ( nume1 < nume2 & nume1 < nume3 & nume2 > nume3 ) {
			System.out.print( "Os valores decrescente são: " + nume2 +" "+ nume3 +" "+ nume1 );
		}
		
		if ( nume1 > nume2 & nume1 < nume3 & nume2 < nume3 ) {
			System.out.print( "Os valores decrescente são: " + nume3 +" "+ nume1 +" "+ nume2 );
		}
		
		if ( nume1 < nume2 & nume1 < nume3 & nume2 < nume3 ) {
			System.out.print( "Os valores decrescente são: " + nume3 +" "+ nume2 +" "+ nume1 );
		}
		
		
		System.out.println( "Digite o turno que você estuda. M-Matutino/V-vespertino/N-noturno: " );
		String turno = input.nextLine().toLowerCase();
		
		switch (turno){
			case "m":
				System.out.println( "BOM DIA!" );
				break;
			
			case "v":
				System.out.println( "BOA TARDE!" );
				break;
			
			case "n":
				System.out.println( "BOA NOITE!" );
				break;
				
			default:
				System.out.println( "Este não é um dia válido!" );
		}
		
		
		
		System.out.print( "Digite seu salário: ");
		double salario1 = input.nextDouble();
		double calc;
		
		if (salario1 <= 280 ){
			calc = salario1 + (salario1 * 0.20);
			System.out.println( "O Valor do salário antes é R$ " + salario1  );
			System.out.println( "O reajuste foi de 20%" );
			System.out.println( "O valor de aumento foi de R$ " + salario1 * 0.20 );
			System.out.println( "O novo salario é de R$ " + calc );			
		}else if (salario1 < 280 & salario1 <= 700 ){
			calc = salario1 + (salario1 * 0.15);
			System.out.println( "O Valor do salário antes é R$ " + salario1  );
			System.out.println( "O reajuste foi de 15%" );
			System.out.println( "O valor de aumento foi de R$ " + salario1 * 0.15 );
			System.out.println( "O novo salario é de R$ " + calc );			
		}else if (salario1 < 700 & salario1 <= 1500  ){
			calc = salario1 + (salario1 * 0.10);
			System.out.println( "O Valor do salário antes é R$ " + salario1  );
			System.out.println( "O reajuste foi de 10%" );
			System.out.println( "O valor de aumento foi de R$ " + salario1 * 0.10 );
			System.out.println( "O novo salario é de R$ " + calc );			
		}else if (salario1 <  1500  ){
			calc = salario1 + (salario1 * 0.05);
			System.out.println( "O Valor do salário antes é R$ " + salario1  );
			System.out.println( "O reajuste foi de 5%" );
			System.out.println( "O valor de aumento foi de R$ " + salario1 * 0.05 );
			System.out.println( "O novo salario é de R$ " + calc );			
		}
		
		
		System.out.print( "Digite o valor da sua hora trabalhada: " );
		double valorHoraTrab = input.nextDouble();
		System.out.print( "Digite a quantidade de horas trabalhadas no mês: " );
		double qtdHoraTrab = input.nextDouble();
		double salarioCalc = 0;
		double calc = 0;
		DecimalFormat df = new DecimalFormat("0.##");
		DecimalFormat dl = new DecimalFormat("0.00##");
		
		salarioCalc = valorHoraTrab * qtdHoraTrab;
		String saida = df.format(qtdHoraTrab);
		String saida2 = df.format(valorHoraTrab);
		String saida3 = dl.format(salarioCalc);
		
		if ( salarioCalc <= 900  ) {
			
			System.out.println(" ");
			System.out.println( "Salário Bruto ("+ saida2 + " * " + saida + "): R$ " + saida3  );
			System.out.println( "(-) IR (Isento)        : R$ 0,00" );
			System.out.println( "(-) INSS ( 10% )       : R$ " + salarioCalc * 0.10 );
			System.out.println( "FGTS ( 11% )           : R$ " + salarioCalc * 0.11 );
			System.out.println( "Total de descontos     : R$ " + ((salarioCalc * 0.10) + (0.00)) );
			String saida4 = dl.format((salarioCalc - ((salarioCalc * 0.10) + (0.00))));
			System.out.print  ( "Salário Liquido        : R$ " + saida4 );
					
		}else if ( salarioCalc > 900 && salarioCalc <= 1500 ) {
			
			System.out.println(" ");
			System.out.println( "Salário Bruto ("+ saida2 + " * " + saida + "): R$ " + saida3  );
			System.out.println( "(-) IR ( 5% )          : R$ " + salarioCalc * 0.05 );
			System.out.println( "(-) INSS ( 10% )       : R$ " + salarioCalc * 0.10 );
			System.out.println( "FGTS ( 11% )           : R$ " + salarioCalc * 0.11 );
			System.out.println( "Total de descontos     : R$ " + ((salarioCalc * 0.10) + (salarioCalc * 0.05)) );
			String saida4 = dl.format((salarioCalc - ((salarioCalc * 0.10) + (salarioCalc * 0.05))));
			System.out.print  ( "Salário Liquido        : R$ " + saida4 );
					
		}else {
			
			System.out.println(" ");
			System.out.println( "Salário Bruto ("+ saida2 + " * " + saida + "): R$ " + saida3  );
			System.out.println( "(-) IR ( 5% )          : R$ " + salarioCalc * 0.05 );
			System.out.println( "(-) INSS ( 10% )       : R$ " + salarioCalc * 0.10 );
			System.out.println( "FGTS ( 11% )           : R$ " + salarioCalc * 0.11 );
			System.out.println( "Total de descontos     : R$ " + ((salarioCalc * 0.10) + (salarioCalc * 0.05)) );
			String saida4 = dl.format((salarioCalc - ((salarioCalc * 0.10) + (salarioCalc * 0.05))));
			System.out.print  ( "Salário Liquido        : R$ " + saida4 );
					
		}
		
		System.out.println( "Digite numeros que conrrepondem os dias da (ex. 1 = Domingo..) : " );
		int dias = input.nextInt();
		
		switch (dias) {
			case 1:
				System.out.println( "1 - Domingo" );
				break;
			case 2:
				System.out.println( "2 - Segunda-feira" );
				break;
			case 3:
				System.out.println( "3 - Terça-feira" );
				break;
			case 4:
				System.out.println( "4 - Quarta-Feira" );
				break;
			case 5:
				System.out.println( "5 - Quinta-feira" );
				break;
			case 6:
				System.out.println( "6 - Sexta-feira" );
				break;
			default:
				System.out.println( "Valor inválido" );
		}
		
		
		System.out.print( "Digite a primeira nota: " );
		double nota11 = input.nextDouble();
		System.out.print( "Digite a segunda nota: " );
		double nota22 = input.nextDouble();
		double media1 = (nota11 + nota22)/2;
		
		if (media1 > 9.0){
			System.out.println( "Primeira nota " + nota11 +" segunda nota " + nota22 + " igual a média " + media1 + ". Conceito A = APROVADO.");
			
		}else if (media1 > 7.5 && media1 <= 9.0){
			System.out.println( "Primeira nota " + nota11 +" segunda nota " + nota22 + " igual a média " + media1 + ". Conceito B = APROVADO.");
			
		}else if (media1 > 6.0 && media1 <= 7.5){
			System.out.println( "Primeira nota " + nota11 +" segunda nota " + nota22 + " igual a média " + media1 + ". Conceito C = APROVADO.");
			
		}else if (media1 > 4.0 && media1 <= 6.0){
			System.out.println( "Primeira nota " + nota11 +" segunda nota " + nota22 + " igual a média " + media1 + ". Conceito D = REPROVADO.");
			
		}else {
			System.out.println( "Primeira nota " + nota11 +" segunda nota " + nota22 + " igual a média " + media1 + ". Conceito E = REPROVADO.");
			
		}
		
		
		System.out.println( "Digite o primeiro lado do triangulo: " );
		int lado1 = input.nextInt();
		System.out.println( "Digite o segundo lado do trangulo: ");
		int lado2 = input.nextInt();
		System.out.println( "Digite o segundo lado do trangulo: " );
		int lado3 = input.nextInt();
		
		if (( lado1+lado2 ) < lado3 ){
			System.out.println( "Valores inválidos, não formam um triangulo." );
		}else{
			if ( lado1 == lado2 && lado2 == lado3 ){
				System.out.println( "Triangulo equilátero." );
			}else if ( lado1 == lado2 || lado2 == lado3 || lado3 == lado1 ){
				System.out.println( "Triangulo isósceles." );
			}else {
				System.out.println( "Triangulo escaleno." );
			}
		
		}
		
		
		System.out.print( "Segundo a equação do 2º grau (ax2+bx+c), digite o valor de A: ");
		int AX = input.nextInt();
		if ( AX == 0 ){
			System.out.println( "A = 0 não torna a quação de 2ºgrau." );
		}else{
			System.out.print( "Digite o valor B da equação: " );
			int BX = input.nextInt();
			System.out.println( "Digite o valor C da equação: " );
			int CX = input.nextInt();
			
			double delta = Math.sqrt((BX * BX) - (4 * AX * CX));
			
			if (delta < 0) {
				System.out.println( "A equação não possui raizes reais." );
			}else {
				if ( delta == 0){
					System.out.println( "Esta equação possui somente uma raiz real." );
					
				}else{
					System.out.println( "Esta equação possui duas raizes reais." );
				}
				
			}
			
		}
		
		
		System.out.print( "Digite o ano em 4 digitos : ");
		int anob = input.nextInt();
		
		if ( anob % 4 == 0 ){
			if (anob % 100 != 0 ) {
				System.out.printf( "O ano de %s é BISEXTO.", anob );
			}else if (anob % 400 == 0){
				System.out.printf( "O ano de %s é BISEXTO.", anob );
			}else {
				System.out.printf( "O ano de %s não é BISEXTO.", anob );
			}
		}else {
			if ( anob % 400 == 0 ){
				System.out.printf( "O ano de %s é BISEXTO.", anob );
			}else {
				System.out.printf( "O ano de %s não é BISEXTO.", anob );
			}
		}
		
		
		int div = 0;
		
		System.out.println( "digite um numero inteiro positivo :");
		int numeroPrimo = input.nextInt();
		
		for (int i = 1 ; i <= numeroPrimo; i ++){
			if (numeroPrimo % i == 0) {
				div ++;
			}
		}
		System.out.println(div);
		if (div == 2) {
			System.out.printf( "O número %s é primo.", numeroPrimo );
		}else {
			System.out.printf( "O número %s não é primo.", numeroPrimo );
		}
		
		
		System.out.println( "Digite o primeiro número: " );
		int numer1 = input.nextInt();
		System.out.println( "Digite o segundo número: " );
		int numer2 = input.nextInt();
		System.out.println( "Escolha 1 - para saber par/impar ou 2 - positivo ou negativo: " );
		int token = input.nextInt();
		
		if (token == 1){
			
			if (numer1 == 0){
				System.out.println( "0 é elemento neutro." );
			}
			if (numer2 == 0){
				System.out.println( "0 é elemento neutro." );
			}
			
			if (numer1 % 2 == 0 & numer1 != 0){
				System.out.printf( "O número %s é par. \n", numer1 );
			}else{
				System.out.printf( "O número %s é impar. \n", numer1 );
			}
			
			if (numer2 % 2 ==0 && numer2 != 0){
				System.out.printf( "O número %s é par. \n", numer2 );
			}else{
				System.out.printf( "O número %s é impar. \n", numer2 );
			}
			
		}else if (token == 2){
			
			if (numer1 == 0){
				System.out.println( "0 é elemento neutro. \n" );
			}
			if (numer2 == 0){
				System.out.println( "0 é elemento neutro. \n" );
			}
			if (numer1 > 0 && numer1 != 0){
				System.out.printf( "O número %s é positivo. \n", numer1 );
			}else{
				System.out.printf( "O número %s é negativo. \n", numer1 );
			}
			if (numer2 > 0 && numer2 != 0){
				System.out.printf( "O número %s é positivo. \n", numer2 );
			}else{
				System.out.printf( "O número %s é negativo. \n", numer2 );
			}
						
		}
		
		
		int contr = 0;
		System.out.println( "Você telefonou para a vitima? S/N: " );
		char respo = input.next().charAt(0);
		
		if (respo == 's'){
			contr ++;
			respo = 0;
		}
		
		System.out.println( "Você esteve no local do crime? S/N: " );
		respo = input.next().charAt(0);
		
		if (respo == 's'){
			contr ++;
			respo = 0;
		}
		
		System.out.println( "Você mora perto da vitima? S/N: " );
		respo = input.next().charAt(0);
		
		if (respo == 's'){
			contr ++;
			respo = 0;
		}
		
		System.out.println( "Você devia para a vitima? S/N: " );
		respo = input.next().charAt(0);
		
		if (respo == 's'){
			contr ++;
			respo = 0;
		}
		
		System.out.println( "Você já trabalhou com a vitima? S/N: " );
		respo = input.next().charAt(0);
		
		if (respo == 's'){
			contr ++;
			respo = 0;
		}
		
		switch (contr) {
			case 2:
				System.out.println( "Você é suspeito no caso.");
				break;
			case 3:	
			case 4:
				System.out.println( "Você é cumplice no caso.");
				break;
			case 5:
				System.out.println( "Você é 0 ASSASSINO e ESTÄ PRESO!!");
				break;
			default:
				System.out.println( "Você é inocente!");
		}
		
		
		System.out.println( "Escolha o tipo de conbustível A -álcool / G -gasolina: " );
		char tipoC = input.next().charAt(0);
		
		System.out.println( "Quantos litros você abasteceu?: " );
		int litros = input.nextInt();
		
		double valortotal;
		double valorAlc = 1.90;
		double valorGas = 2.50;
		
		if (tipoC == 'A'){
			if (litros <= 20){
				valortotal = litros * (valorAlc - (valorAlc * 0.03));
			}else{
				valortotal = litros * (valorAlc - (valorAlc * 0.05));
			}
			System.out.println( "Total a pagar é R$ " + valortotal );
		}else if (tipoC == 'G'){
			if (litros <= 20){
				valortotal = litros * (valorAlc - (valorAlc * 0.04));
			}else{
				valortotal = litros * (valorAlc - (valorAlc * 0.06));
			}
			System.out.println( "Total a pagar é R$ " + valortotal );
		}
		
		
		System.out.println( "Digite o peso de morangos da compra: " );
		double morangos = input.nextDouble();
		System.out.println( "Digite o peso das maçãs da compra: " );
		double macas = input.nextDouble();
		double frutas = morangos + macas;
		double valorMorango;
		double valorMacas;
		double valorDesconto;
		double comprasTotal;
		
		if (morangos <= 5){
			valorMorango = morangos * 2.5;
			valorMacas = macas * 1.8;
		}else {
			valorMorango = morangos * 2.2;
			valorMacas = macas * 1.5;
		}
		
		if (frutas > 8 || (valorMacas + valorMorango) >= 25 ){
			valorDesconto = ((valorMacas + valorMorango) * 0.10);
			comprasTotal = (valorMacas + valorMorango) - valorDesconto;
			System.out.println( "o valor das compras com descontos é R$ " + comprasTotal );
		}else {
			comprasTotal = (valorMacas + valorMorango); 
			System.out.println( "o valor total das compras é de R$ " + comprasTotal );
		}
		*/
		System.out.println( "Qual o tipo da carne escolhida: F = Filé duplo / A = Alcatra / P = Picanha: " );
		String tipoCarne = input.next().toLowerCase();
		System.out.println( "Quantos quilos de carne vai comprar?: " );
		double qtdCarne = input.nextDouble();
		System.out.println( "Qual a forma de pagqmento D = Dinheiro / C = Cartão de crédito: " );
		char formaPagamento = input.next().charAt(0);
		double valorDesconto;
		double valorTotal;
		
		
		
		switch (tipoCarne){
			case "a":
				if (qtdCarne <= 5 ) {
					if (formaPagamento == 'c'){
						valorDesconto = ((qtdCarne * 5.9) *0.05);
						valorTotal = (qtdCarne * 5.9) - valorDesconto;
						System.out.println( "o valor da compra da alcatra com desconto é R$ " + valorTotal); 
					}else {
						valorTotal = (qtdCarne * 5.9);
						System.out.println( "o valor da compra da alcatra é R$ " + valorTotal);
					}
				}else {
					if (formaPagamento == 'c'){
						valorDesconto = ((qtdCarne * 6.8) *0.05);
						valorTotal = (qtdCarne * 6.8) - valorDesconto;
						System.out.println( "o valor da compra da alcatra com desconto é R$ " + valorTotal); 
					}else {
						valorTotal = (qtdCarne * 6.8);
						System.out.println( "o valor da compra da alcatra é R$ " + valorTotal);
					}
				}	
				break; 
			case "f":
				
				if (qtdCarne <= 5 ) {
					
					if (formaPagamento == 'c'){
						valorDesconto = ((qtdCarne * 4.9) *0.05);
						valorTotal = (qtdCarne * 4.9) - valorDesconto;
						System.out.println( "o valor da compra do filé duplo com desconto é R$ " + valorTotal); 
					}else {
						valorTotal = (qtdCarne * 4.9);
						System.out.println( "o valor da compra do filé duplo é R$ " + valorTotal);
					}
				}else {
					if (formaPagamento == 'c'){
						valorDesconto = ((qtdCarne * 5.8) *0.05);
						valorTotal = (qtdCarne * 5.8) - valorDesconto;
						System.out.println( "o valor da compra do filé duplo com desconto é R$ " + valorTotal); 
					}else {
						valorTotal = (qtdCarne * 5.8);
						System.out.println( "o valor da compra do filé duplo é R$ " + valorTotal);
					}
				}	
				break; 
			case "p":
				if (qtdCarne <= 5 ) {
					if (formaPagamento == 'c'){
						valorDesconto = ((qtdCarne * 6.9) *0.05);
						valorTotal = (qtdCarne * 6.9) - valorDesconto;
						System.out.println( "o valor da compra da picanha com desconto é R$ " + valorTotal); 
					}else {
						valorTotal = (qtdCarne * 6.9);
						System.out.println( "o valor da compra da picanha é R$ " + valorTotal);
					}
				}else {
					if (formaPagamento == 'c'){
						valorDesconto = ((qtdCarne * 7.8) *0.05);
						valorTotal = (qtdCarne * 7.8) - valorDesconto;
						System.out.println( "o valor da compra da picanha com desconto é R$ " + valorTotal); 
					}else {
						valorTotal = (qtdCarne * 7.8);
						System.out.println( "o valor da compra da picanha é R$ " + valorTotal);
					}
				}	
				break; 
			default :
				System.out.println( "Escolha inválida!" );
			}
		
		
		
	}
}


