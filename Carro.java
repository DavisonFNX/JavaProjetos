
public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	
	void acelerar(){
		velocidade += potencia;
	}
	
	void frear(){
		velocidade = velocidade /2;
	}
	
	int getVelocidade(){
		return velocidade;
	}
	
	void imprimir(){
		System.out.println( "O carro " + nome + " está a velocidade de " + getVelocidade() + " km/h"); 
	
	
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}
