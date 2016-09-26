
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

class exercicios {
	
	public static void main ( String[] args ) {

		Scanner input = new Scanner ( System.in );
		input.useLocale ( Locale.US );

		// Verificar a temperatura maior/menor/média

		double temperaturaMenor = 1000000;
		double temperaturaMaior = 0;
		double temperatura = 0;
		double somaTemperatura = 0;
		double mediaTemperatura = 0;
		int index = 1;
		int cont = 1;

		System.out.print( "Digite o valor das temperaturas ou tecle \"0\" para sair: ");
		
		while ( index == 0 ) {
		
			temperatura = input.nextDouble();
			if ( temperatura == 0 ) {
				index = 0;
			}else {
				System.out.print( "Valor da temperatura " + cont + " : " );
				somaTemperatura += temperatura;
				cont += 1;
				if ( temperatura > temperaturaMaior ) {
					temperaturaMaior = temperatura;
				}

				if ( temperatura < temperaturaMenor ) {
					temperaturaMenor = temperatura;
				} 			
			}

		}
		
		System.out.println( " " );
		System.out.println( "A menor temperatura é " + temperaturaMenor);
		System.out.println( "A maior temperatura é " + temperaturaMaior);
		System.out.println ( "A média das temperaturas é " + somaTemperatura / cont ); 


		System.out.println("\n\nFim do programa!");

	}
}
