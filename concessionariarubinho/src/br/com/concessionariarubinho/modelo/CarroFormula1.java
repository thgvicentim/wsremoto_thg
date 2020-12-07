package br.com.concessionariarubinho.modelo;

public class CarroFormula1 {

	//atributos (Caracteristicas)
	private String cor;
	private float valor;
	private String escuderia;
	private float velocidade;
	private boolean status;

	//metodos(comportamentos)
	//<modificador> <tipo do retorno> <nomDoMetodo> (<tipoParam> <nome do param>){

	
	public float retornarVelocidade() {
		return velocidade;
	}
	
	public void brecar() {
		if (status==true) {
			velocidade=0;
		}
	}
	
	public void acelerar(float param) {
		if (param>0 && status ==true) {
			velocidade+=param;
		}
	}
	
	public String desligar() {
		if (status == false) {
			return "Carro ja estava desligado";
		}
		status=false;
		velocidade=0;
		return "Carro esta parado";
	}
	
	
	public String ligar() {
		if (status == true) {
			return "Carro ja estava ligado";
		}
		status =true;
		return "Carro ligado agora";
	}
	

	public String retornarCor() {
		return cor;
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public String retornarEscuderia() {
		return escuderia;
	}
	
	public void preencherValor(float param) {
		if (valor>0) {
			valor = param;
		}
	}

	public void preencherCor(String param) {
		cor = param.toUpperCase();
	}

	public void preencherEscuderia(String param) {
		escuderia = param.toUpperCase();
	}















}
