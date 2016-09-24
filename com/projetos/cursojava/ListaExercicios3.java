package com.projetos.cursojava;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ListaExercicios3 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		input.useLocale(Locale.US);
		
		/*
		int nota;
		int token = 1;
		while ( token != 0 ) {
			System.out.println( "Digite um valor entre 0 e 10: " );
			nota = input.nextInt();
			
			for (int i = 0; i < 10; i++){
				if (i == nota){
					System.out.println( "Correto o valor é " + nota );
					token = 0;
					break;
				}
					
				}
			if (token == 1){
			System.out.println( "Valor inválido!" );
			}
			} 
		
		
		int senha;
		int token = 1;
		System.out.print( "Digite o nome do novo usuário: " );
		String user = input.nextLine();
		do {
			System.out.print( "Digite a nova senha: " );
			String passw = input.nextLine();
			if ( passw.equals(user)){
				System.out.println( "A senha inválida, não pode ser igual ao nome." );
			}else{
				System.out.println( "Usuário cadastrado com sucesso!" );
				token = 0;
			}
						
		}while (token == 1);
		
		int token =1;
		do{
		System.out.print( "Digite seu nome: " );
		String nomeValida = input.nextLine();
		if (nomeValida.length() <= 3 ){
			System.out.println( "Invalido a quantidade de caractes inferioir a 3." );
		}else{
			token = 0;
		}
		
		}while (token != 0);
		
		
		token = 1;			
		do{
		System.out.print( "Digite sua idade: " );
		int idadeValida = input.nextInt();
		if (idadeValida <= 0 || idadeValida > 150){
			System.out.println( "Valores inválidos!" );
		}else{
			token = 0;
		}
		}while (token != 0);
		
		
		token = 1;
		do{
		System.out.print( "Digite seu salário: " );
		double salarioValida = input.nextDouble();
		if (salarioValida <= 0){
			System.out.println( "Valores inválidos!" );
		}else {
			token = 0;
		}
		}while(token != 0);
		
		token = 1;
		do{
		System.out.print( "Digite o sexo: " );
		char sva = input.next().charAt(0);
		char sexoValida = Character.toLowerCase(sva);
		System.out.println(sexoValida);
		
		switch (sexoValida){
			case 'm':
			case 'f':
				token = 0;
				break;
			default:
				System.out.println( "Valor inválido!" );
		
		}
		
		}while (token != 0);
		
		
		token =1;
		do{
		System.out.print( "Digite seu estado civil(S - solteiro/C- casado/V - viúvo/D - divorciado: " );
		char ec = input.next().charAt(0);
		char estadocivilValida = Character.toLowerCase(ec);
		
		switch (estadocivilValida){
			case 's':
			case 'c':
			case 'v':
			case 'd':
				token = 0;
				break;
			default:
				System.out.println( "Caracter inválido!" );
		}
		}while (token != 0);
		System.out.println( "Fim do programa!" );
		
		long populacaoA = 80000;
		long populacaoB = 200000;
		double taxaCrescimentoA = populacaoA * 0.03;
		double taxaCrescimentoB = populacaoB * 0.015;
		int count = 0;
		
		for ( int i = 0 ; populacaoA <= populacaoB ; i++ ){
			populacaoA += taxaCrescimentoA;
			populacaoB += taxaCrescimentoB;
			count ++;

			System.out.println("A = " + populacaoA);
			System.out.println("B = " + populacaoB);
			System.out.println(" ");
			taxaCrescimentoA = populacaoA * 0.03;
			taxaCrescimentoB = populacaoB * 0.015;

		}
		System.out.println("A população A alcançará a população B em " + count + " anos.");
		

		System.out.print( "informe o valor da população A: " );
		long populacaoA = input.nextLong();
		System.out.print( "informe o valor da população b: " );
		long populacaoB = input.nextLong();
		
		System.out.print( "informe o percentual de crescimento da população A: " );
		double percentualA = input.nextDouble();
		
		System.out.print( "informe o percentual de crescimento da população B: " );
		double percentualB = input.nextDouble();
		
		double taxaCrescimentoA = populacaoA * (percentualA / 100 );
		double taxaCrescimentoB = populacaoB * (percentualB / 100 );
		int count = 0;
		
		for ( int i = 0 ; populacaoA <= populacaoB ; i++ ){
			populacaoA += taxaCrescimentoA;
			populacaoB += taxaCrescimentoB;
			count ++;

			System.out.println("A = " + populacaoA);
			System.out.println("B = " + populacaoB);
			System.out.println(" ");
			taxaCrescimentoA = populacaoA * ( percentualA / 100 );
			taxaCrescimentoB = populacaoB * ( percentualB / 100 );

		}
		System.out.println("A população A alcançará a população B em " + count + " anos.");
		System.out.println( "Fim do programa!" );
		
		for ( int i =1; i <= 20; i++ ){
			System.out.print(i + " " );
		}
		System.out.println( "\nFim do programa!" );
		
		
		int maior = 0;
		int cont = 1;
		do{
			System.out.print( "Digite o " + cont +"º numero: " );
			int numero = input.nextInt();
			if (numero > maior){
				maior = numero;
			}
			cont++;
		}while (cont <= 5);
		
		System.out.println( "O maior número é " + maior );	
		
		
		int maior = 0;
		int cont = 1;
		do{
			System.out.print( "Digite o " + cont +"º numero: " );
			int numero = input.nextInt();
			maior += numero;
			cont++;
		}while (cont <= 5);
		System.out.println(cont);
		System.out.println( "A soma dos números é " + (maior) );
		System.out.println( "A média dos números é " + (maior / (cont -1)) );	
		
		
		for (int i = 1 ; i <= 50 ; i++){
			if (i % 2 == 0){
				
			}else {
				System.out.print(i + " " );
			}
			
		}
		
		
		System.out.println( "Digite o primeiro intervalo de 2 números: ");
		int intervalo1 = input.nextInt();
		System.out.println( "Digite o segundo intervalo de 2 números: " );
		int intervalo2 = input.nextInt();
		System.out.print( "\nO intervalo é: ");
		for ( int i = intervalo1; i <= intervalo2 ; i++){
			System.out.print( i + " " );
		}
		
		
		System.out.println( "Digite o primeiro intervalo de 2 números: ");
		int intervalo1 = input.nextInt();
		System.out.println( "Digite o segundo intervalo de 2 números: " );
		int intervalo2 = input.nextInt();
		
		int soma = 0;
		
		for ( int i = intervalo1; i <= intervalo2 ; i++){
			soma += i;
		}
		System.out.print( "A soma do intervalo é: " + soma);
		
		
		System.out.print( "Digite qual tabuada que será apresentada: " );
		int tabuada = input.nextInt();
		
		System.out.println( "Tabuada de " + tabuada + ":");
		for (int i = 0; i <= 10; i++){
			System.out.println( tabuada + " X " + i + " = " + (tabuada * i));
		}
		
		
		System.out.print( "Digite o valor da base da exponenciação: ");
		int baseExp = input.nextInt();
		System.out.print( "Digite o valor do expoente: ");
		int expoente = input.nextInt();
		int valorExpoente = baseExp;
		
		for (int i = 1; i < expoente; i++){
			valorExpoente *= baseExp;
			
		}
		System.out.println( "O valor é: " + valorExpoente );
		
		
		int counter = 1;
		int pares = 0;
		int impares = 0;
		
		do{
			System.out.print( "Digite o " + counter + "º número inteiro  no total de 10: " );
			int inteiros = input.nextInt();
			if (inteiros % 2 == 0){
				pares += 1;
			}else {
				impares += 1;
			}
			counter ++;
			
		}while (counter <= 10);
		
		System.out.print( "Total de números pares: " + pares );
		System.out.println( "\n Total de números impares: " + impares);
		
		
		System.out.print( "Digite a quantidade de sequencias do Fibonacci: " );
		int fibonacci = input.nextInt();
		
		int n1 =0;
		int n2 = 1;
		int n3;
		System.out.print(n1 + " ");
		for (int i = 0 ; i< fibonacci; i++){
			
			if ( i < 1 ){
			for (int j = 0; j<= 2; j++)
					if (j <= 1){
						System.out.print(n2 + n1 + " ");
						n1 = j;
			
					}else if (j == 2){
						System.out.print(n2 + n1 + " ");
						n2 = j ;
				
			}
			}			
			System.out.print( n2 + n1 + " ");
						
			n3 = n2;
			n2 = n2 + n1; 
			n1 = n3;
		}
		
		
		System.out.print( "Digite o numero inteiro para o fatorial: " );
		 int fatorial = input.nextInt();
		 int n1 = fatorial * (fatorial - 1);
		 
		 for (int i = (fatorial - 1); i > 1; i--){
			  n1 = n1 * (i - 1);
		 }
			System.out.print( "O fatorial é: " +n1 );	
		
		
		System.out.print( "Digite um número inteiro positivo: " );
		int primo = input.nextInt();
		
		int cont = 0;
		
		for (int i = 1; i <= primo; i++){
			if (primo % i == 0){
				cont = cont + 1;
			}
		 }
		
			if (cont > 2 || cont == 1 || cont == 0){
				System.out.println( primo + " não é um número primo." );
				
			}else{
				System.out.println(primo + " é um número primo." );
				
			}
			
		System.out.print( "Você vai digitar quantas notas?: " );
		int numeroNotas = input.nextInt();
		double notasMedia = 0;
		double notas = 0;
		for (int i = 1; i<= numeroNotas; i++){
			System.out.printf( "Digite a nota nº %s: ", i);
			notas = input.nextDouble();
			notasMedia += notas;
		}
		System.out.println( " " );
		System.out.println( "A media das notas é " + notasMedia / numeroNotas );
		
		
		double jovem = 0;
		double adulto = 0;
		double idoso = 0;

		System.out.print( "Digite o número de pessoas que você vai cadastrar: " );
		int pessoas = input.nextInt();
		
		for (int i = 1; i <= pessoas; i++ ) {
			System.out.print( "Digite a idade da " + i + "ª pessoa: " );
			int idade = input.nextInt();
			
			if (idade <= 25) {
				jovem += 1;
			}else if(idade >25 && idade <= 60){
				adulto += 1;
			}else {
				idoso += 1;
			}
		}
		
		if (jovem > adulto && jovem > idoso){
			System.out.println( "A população é de maioria jovem com " + (jovem / pessoas) *100 +"%.");
		}if (adulto > jovem && adulto > idoso){
			System.out.println( "A população é de maioria adulta com " + (adulto / pessoas) *100 +"%.");
		}else if (idoso > jovem && idoso > adulto){
			System.out.println( "A população é de maioria idosa com " + (idoso / pessoas) *100 +"%.");
		}
		
		
		
		System.out.print( "Digite a quantiade de turmas: " );
		int turmas = input.nextInt();
		int totalAlunos = 0;
		int alunos;
		for (int i = 1; i <= turmas; i ++){
			
			do {
				System.out.print( "Digite a quantidade de alunos da turma " + i +" (max. 40 alunos):" );
				alunos = input.nextInt();
				if ( alunos > 40){
					System.out.print( "Número de alunos ultrapassou a quantidade de 40 por turma!\n\n" );
				}
			} while (alunos > 40);
			
			totalAlunos += alunos;
			
		}
		System.out.println( " " );
		System.out.println( "A media de alunos por classe é de " + totalAlunos / turmas );
		
		int conter = 0;
		double valores = 0;
		int token = 0;
		double totalCDS =0;
		
		System.out.print( "Digite a quantidade de coleções de CDs para o calculo: " );
		int CDS = input.nextInt();
		
		for (int i =1; i <= CDS; i++){
			System.out.print( "Digite o valor da coleção " + i + " : " );
			totalCDS += input.nextDouble();
			
			
		}
		
		System.out.println( "Total inverstido em CDS: R$ " + totalCDS );
		System.out.print( "O valor médio gasto em cada CD foi de R$ " + totalCDS / CDS );
		
		
		double valorTabela = 1.99;
		
		System.out.println( "loja Quase Dois - Tabela de preços" );
		for (int i = 1 ; i <= 50 ; i++){
			System.out.println(i + " - R$ " + valorTabela * i);
		}
		
		
		System.out.print( "Digite o valor da unidade do pão: " );
		double valorTabela = input.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00##");
		String saida;
		
		System.out.println( " " );
		System.out.println( "Preço do pão: R$ " + valorTabela );
		System.out.println( "Panificadora Pão de Ontem - Tabela de preços" );
		for (int i = 1 ; i <= 50 ; i++){
			if (i < 10){
			saida = df.format(valorTabela * i);
			System.out.println(i + "  - R$ " + saida);
			}else{
				saida = df.format(valorTabela * i);
				System.out.println(i + " - R$ " + saida);
			}
		}
		*/
		int token = 1;
		double valoresMercadoria = 0;
		double totalMercadoria = 0;
		DecimalFormat df = new DecimalFormat("0.00##");
		String saidaCaixa;
		String saidaDinheiro;
		int cont = 1;
		
		System.out.println( "Lojas Tabajara" );
		System.out.print( "Digite o valor do produto " + cont + " ou 0 pra sair: ");
		
		while (token != 0){
			valoresMercadoria = input.nextDouble();
			if (valoresMercadoria == 0){
				token = 0;
			}else {
				saidaCaixa = df.format(valoresMercadoria);
				System.out.print( "Produto " + cont + ": R$ " + saidaCaixa + "  ");
				totalMercadoria += valoresMercadoria;
				cont += 1;
			}
			
		}
		System.out.println( " " );
		saidaCaixa = df.format(totalMercadoria);
		System.out.println( "Total: R$ " + saidaCaixa);
		System.out.print( "Dinheiro: R$ ");
		double dinheiro = input.nextDouble();
		saidaDinheiro = df.format(dinheiro - totalMercadoria);
		System.out.println( "Troco R$ " + saidaDinheiro);
		
		
		
		
		
		
		
		System.out.println( "\n\nFim do programa!" );
		}

	}



