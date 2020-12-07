package br.com.lojaabc.beans;

public class Produto {
	
	/*Atributos*/
	private int id;
	private String descricao;
	private float valorCompra;
	private float valorVenda;
	private int qtde;
	private Fabricante fabricante;
	
	/*Metodos*/
	
	
	//calcularTotal() => deve retornar o total, com base no valor de compra.
	public float calcularTotal() {
		return valorCompra * qtde;
	}
	
	//verificarEstoque() => devera retornar a mensagem”Estoque baixo” caso a qtde do produto esteja menor que 5.
	public String verificarEstoque() {
		if (qtde<5) {
			return "Estoque baixo";
		}
		return "Estoque normal";
	}
	
	//atualizaValores(float porcentagem) => devera atualizar os valores de acordo com a porcentagem fornecida.
	public void atualizarValores(float porcentagem) {
		valorCompra = valorCompra + valorCompra * (porcentagem/100);
		//valorVenda = valorVenda = valorCompra * (porcentagem/100); ou ele usa o get e set pra fazer.
		setValorVenda(getValorVenda() + getValorVenda() * (porcentagem/100));
	}
	
	
	public Produto() {
		super();
	}

	public Produto(int id, String descricao, float valorCompra, float valorVenda, int qtde, Fabricante fabricante) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
		this.fabricante = fabricante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorCompra=" + valorCompra + ", valorVenda="
				+ valorVenda + ", qtde=" + qtde + ", fabricante=" + fabricante + "]";
	}

	public void setAll(int id, String descricao, float valorCompra, float valorVenda, int qtde, Fabricante fabricante) {
		this.id = id;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
		this.fabricante = fabricante;
	}
	
	
	
	
	
	
	

}
