package br.com.universiddadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universiddadexyz.beans.Aluno;

public class ImplementarAluno2 {

	public static void main(String[] args) {
		
		//instanciar o objeto ou criar o objeto
		Aluno aluno = new Aluno();
		
		//Inserir os dados
		aluno.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("Nome"),
				JOptionPane.showInputDialog("CPF")
				);
		
		//visualizar saida dos dados 
		System.out.println(aluno.getAll());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
