package br.com.universiddadexyz.implementacao;

import br.com.universiddadexyz.beans.Endereco;
import br.com.universiddadexyz.beans.Professor;

public class ImplementarProfessor {

	public static void main(String[] args) {
		
		/* instanciar o objeto Professor*/
		Professor p = new Professor();
		p.setApelido("1berto");
		p.setId(709);
		p.setFormacao("Ms");
		p.setValorHora(10);
		
		/*Instanciar o objeto Endereço*/
		Endereco e = new Endereco();
		p.setEndereco(e);
		
		e.setLogradouro("Rua BLABLABLA");
		e.setNumero("44");
		e.setBairro("PIMENTAS");
		e.setCidade("GUARULHOS");;
		e.setUf("SP");
		e.setCep("12345-123");
		
		
		//Por boa pratica ja sao instanciados la emcima juntos todos objetos que serao necessarios.
		
		/*Retornar os dados*/
		System.out.println(p.getApelido());
		System.out.println(p.getFormacao());
		System.out.println(p.getEndereco().getBairro());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
