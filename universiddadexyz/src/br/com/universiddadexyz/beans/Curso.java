package br.com.universiddadexyz.beans;

public class Curso {
	
	//atributos (Caracteristicas)
	private String descricao;
	private float valor;
	private short cargaHoraria;
	private String sigla;
	private int id;
	private int duracao;
	
	
	
	
	
	//Criar os construtores vazio e cheio
	
	public Curso() {
		super();		//Sera usado com herança por enquanto nao estamos usando ainda entao nao faz diferença estar aqui
	}
	
	
	public Curso(String descricao, float valor, short cargaHoraria, String sigla, int id, int duracao) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
		this.sigla = sigla;
		this.id = id;
		this.duracao = duracao;
	}
	
	
	//metodos(comportamentos)
	//<modificador> <tipo do retorno> <nomDoMetodo> (<tipoParam> <nome do param>){
	
	/*
	 * - Crie um getPromocao() => vai retornar o valor do curso com 10% de desconto
	 * - Criei um getPromocao(float porcentagem => vai retornar o valor do curso
	 * de acordo com a porcentagem que foi recebida
	 * - Crie um metodo ajustarValor(float porcentagem) => vai alterar o valor do curso de acordo com a porcentagem recebida
	 */
	
	
	//Crie um metodo ajustarValor(float porcentagem) => vai alterar o valor do curso de acordo com a porcentagem recebida
	public void ajustaValor(float porcentagem) {
		valor = valor + valor * (porcentagem/100);
		
		//		valor = 100 + 100 * (10/100) 
		//		valor = 100 + 100 * 0.1
		//		valor = 100 + 10
		//		110		
	}
	
	//Criei um getPromocao(float porcentagem => vai retornar o valor do curso de acordo com a porcentagem que foi recebida
	public float getPromocao(float porcentagem) {
		return valor - valor * (porcentagem/100);
		
		//		100 - 100 * (10/100)
		//		100 - 100 * 0.1
		//		100 - 10
		//		90
	}
	
	//Crie um getPromocao() => vai retornar o valor do curso com 10% de desconto
	public float getPromocao() {
		return  valor * (float) 0.9;
		
		// O JAVA entende o 0.9 como double entao temos que fazer o CAST usando o float
		//		0.1 = 10%
		//		0.9 = 90%
		//		valor * 0.9
	}
	
	
	//Crie o getAll() e setAll() e fazer uma implementacao do curso
	
	public void setAll(String descricao, float valor, short cargaHoraria, String sigla, int id, int duracao) {
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
		this.sigla = sigla;
		this.id = id;
		this.duracao = duracao;
	}
	
	public String getAll() {
		return
				"Descricao....:" + descricao + "\n" +
				"Valor........:" + valor + "\n" +
				"cargaHoraria.:" + cargaHoraria + "\n" +
				"Sigla........:" + sigla + "\n" +
				"ID...........:" + id + "\n" +
				"duracao......:" + duracao;
	}

	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public short getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(short cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
