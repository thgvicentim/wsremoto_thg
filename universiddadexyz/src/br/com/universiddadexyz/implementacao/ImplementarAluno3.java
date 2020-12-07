package br.com.universiddadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universiddadexyz.beans.Aluno;

public class ImplementarAluno3 {

	public static void main(String[] args) {
		
		//Instanciar o objeto Aluno
		Aluno aluno = new Aluno(
				//Vamos pegar os dados pelo construtor
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("Nome"),
				JOptionPane.showInputDialog("CPF")
				);
		
		//Usando o contrutor vc digita menos mais poderia fazer declarando o metodo tbm mais demora mais.
		//Na comunidade de programacao eles usam mais assim ja pegando pelo construtor os dados.
		
		System.out.println(aluno.getAll());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
