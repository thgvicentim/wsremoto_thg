package br.com.universiddadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universiddadexyz.beans.Curso;

public class ImplementarCurso {

	public static void main(String[] args) {



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
		 * 		criar um objeto é simplesmente vc fazer uma demarcacao na memoria do computador, criando um espaco na memoria
		 * 		
		 * 				
		 */

		//Criar um objeto
		//Curso objeto=null;
		//objeto.setDescricao("Engenharia");

		//Instanciar o objeto
		Curso curso = new Curso();

		//Solicitar a entrada
		curso.setAll(
				JOptionPane.showInputDialog("Descricao:"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor:")), 
				Short.parseShort(JOptionPane.showInputDialog("Carga Horaria:")), 
				JOptionPane.showInputDialog("Sigla"), 
				Integer.parseInt(JOptionPane.showInputDialog("ID")), 
				Integer.parseInt(JOptionPane.showInputDialog("Duracao"))
				);

		//Mostrar metodos criados para validar se promocao e reajuste de valores funciona
		System.out.println("Valor Promocao (10%): " + curso.getPromocao());
		System.out.println(curso.getValor());
		float porcentagem = Float.parseFloat(JOptionPane.showInputDialog("Qual o desconto? "));
		System.out.println("Valor Promocao:" + curso.getPromocao(porcentagem));
		System.out.println(curso.getValor());
		curso.ajustaValor(20);


		//Mostra saida de todos os parametros
		System.out.println(curso.getAll());







	}

}
