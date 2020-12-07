package br.com.universiddadexyz.beans;

public class Professor {
	
	/*Atributos*/
	private int id;
	private String apelido;
	private String formacao;
	private float valorHora;
	private Endereco endereco;		//Esse é um atributo de referencia assim como é o caso do String tbm para usar.
									//no caso do endereco no beans nao é preciso importar para que ele visualize pois os dois estao dentro da pasta
	
	
	/*Metodos*/
	
	//equivalente ao getAll, porem gerado automaticamente

	@Override
	public String toString() {
		return "Professor [id=" + id + ", apelido=" + apelido + ", formacao=" + formacao + ", valorHora=" + valorHora
				+ ", endereco=" + endereco + "]";
	}
	
	//Gera outro construtor cheio e apaga o nome construtor coloca "void setAll" e tira a linha com o "super();" e ja era.
	
	public void setAll(int id, String apelido, String formacao, float valorHora, Endereco endereco) {
		this.id = id;
		this.apelido = apelido;
		this.formacao = formacao;
		this.valorHora = valorHora;
		this.endereco = endereco;
	}
		
	/*Constructor*/
	
	public Professor() {
		super();
	}
	
	public Professor(int id, String apelido, String formacao, float valorHora, Endereco endereco) {
		super();
		this.id = id;
		this.apelido = apelido;
		this.formacao = formacao;
		this.valorHora = valorHora;
		this.endereco = endereco;
	}

	
	/*Metodos de get e set para cada Atributo*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
