package br.com.universiddadexyz.implementacao;

import br.com.universiddadexyz.beans.Endereco;
import br.com.universiddadexyz.beans.Professor;

public class ImplementarProfessor3 {

	public static void main(String[] args) {

		/*Instanciar o objeto Professor*/
		Professor p = new Professor(
				1,
				"1berto",
				"Ms",
				10,
				new Endereco(		//Vc ja esta instanciando o objeto Endereco aqui direto
						"Rua X",
						"44",
						"Complemento",
						"Pimentas",
						"Oz",
						"SP",
						"1234566"
						)
				);
		
		System.out.println(p.toString());

	}

}
