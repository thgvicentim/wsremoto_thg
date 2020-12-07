package br.com.universiddadexyz.beans;

/*
 * Design Pattern => compilação de padroes para projetos OO (Boas pratica)
 * Um dos padroes: DTO (Data Transfer Object)
 * 1 ) TODOS os atributos deem ser privados;
 * 2 ) CADA atributo deve possuir de um metodo de Input(set) e um metodo de Output(get)
 * 3 ) Deve a classe a possuir no minimo 2 construtores um vazio e outro cheio(com todos os atributos)
 * 
 * 
 * obs: pacote beanspode ser chamado de javabeans, modelo, model, dto ou to.
 */


/*
 * 		Existe uma diferenca entre criar um objeto e instanciar um objeto:
 * 		Entender na syntax do comando a diferenca
 * 		String nome=""; 			- isso seria criar uma variavel
 * 		String nome = new String();	- isso seria instanciar uma variavel
 * 
 * 		Significa que poderia fazer isso aqui:
 * 		
 * 		Curso objeto=null 			-- Criar um objeto
 * 		Curso curso = new Curso();	-- Instanciar um objeto
 * 
 * 		Qual a diferenca entre criar um objeto e vc instancias um objeto:
 * 
 * 		criar um objeto é simplesmente vc fazer uma demarcacao na memoria do computador, 
 * criando um espaco na memoria
 * 		
 * 		
 */

public class Aluno {

	//atributos (Caracteristicas)
	private int rm;
	private String nome;
	private String cpf;
	
	
	//Criar um construtor:
	//O construto sempre tem o mesmo nome da classe
	
	//construtor Vazio
	public Aluno() {
	}
	
	//construtor cheio
	public Aluno (int rm, String nome, String cpf) {
		this.rm=rm;
		this.nome=nome;
		this.cpf=cpf;
	}
	
	//metodos(comportamentos)
	//<modificador> <tipo do retorno> <nomDoMetodo> (<tipoParam> <nome do param>){
	
	//Facam: preencherNome, RetornarNome, preencherCPF, retornarCPF
	//Fizemos na mao e apagamos depois do Humberto explica como era usado o eclipse para gerar get e set
	
	
	public String getAll() {
		return 
				"RM...: " + rm + "\n" +
				"Nome.: " + nome + "\n" +
				"CPF..: " + cpf;
	}
	
	public void setAll(int rm, String nome, String cpf) {
		this.rm = rm;
		this.nome = nome;
		this.cpf = cpf;		
	}
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
