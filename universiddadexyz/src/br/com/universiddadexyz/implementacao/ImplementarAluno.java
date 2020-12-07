package br.com.universiddadexyz.implementacao;


import br.com.universidadexyz.util.Magic;
import br.com.universiddadexyz.beans.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		
		
		//Instanciar aluno
		Aluno aluno = new Aluno();
		
		aluno.setCpf(Magic.s("CPF"));
		aluno.setNome(Magic.s("Nome").toUpperCase());
		aluno.setRm(Magic.i("RM"));
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("CPF.: " + aluno.getCpf());
		System.out.println("RM..: " + aluno.getRm());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
