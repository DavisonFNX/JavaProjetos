
public class ExecutarExercicio {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.voltagem = "220v";
		lampada.potencia = "30w";
		lampada.tipo = "LED";
		lampada.frequencia = "40hz";
		
		System.out.println( "A lâmpada esta com status" + lampada.acender(1));
		
		
		

	}

}
