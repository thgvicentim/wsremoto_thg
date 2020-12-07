package br.com.lojaabc.Implementacao;


import br.com.lojaabc.beans.Cliente;
import br.com.lojaabc.beans.Fabricante;
import br.com.lojaabc.beans.Produto;
import br.com.lojaabc.beans.Venda;
import br.com.lojaabc.util.Magic;

public class ImplementarVenda {

	public static void main(String[] args) {
		/*
		 * A primeira que fizemos
		 * 
		 * Venda venda = new Venda(
				Magic.i("Nota Fiscal"),
				new Produto(
						Magic.i("Codigo"),
						Magic.s("Descricao"),
						Magic.f("Valor Compra"),
						Magic.f("Valor Venda"),
						Magic.i("Qtde"),
						new Fabricante (
								Magic.s("CNPJ"),
								Magic.s("Razao Social"),
								Magic.s("Fone")
								)
						),
				new Cliente(
						Magic.i("Codigo do Cliente"),
						Magic.s("Nome do Cliente"),
						Magic.s("Email"),
						Magic.b("É especial?")
						),
				Magic.i("Qtde"),
				Magic.f("Total")
				);
				
		System.out.println(venda.toString());
		
		*Abaixo outro modelo de como fazer inserindo e apresentando apenas alguns dados
		*/
		
		Venda venda = new Venda();
		
		venda.setQtde(10);
		venda.getProduto().setValorVenda(1500);
		venda.getProduto().getFabricante().setCnpj("1234567");
		System.out.println(venda.getProduto().getFabricante().getCnpj());
				

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
