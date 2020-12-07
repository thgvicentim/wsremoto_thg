package br.com.universiddadexyz.implementacao;

import br.com.universidadexyz.util.Magic;
import br.com.universiddadexyz.beans.Aluno;
import br.com.universiddadexyz.beans.Curso;
import br.com.universiddadexyz.beans.Professor;
import br.com.universiddadexyz.beans.Turma;

public class ImplementarTurma {

	/*Criando metodos staticos para ligar o modo preguica e nao digitar JOptionPane e suas variacoes

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}

	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	ai vc substitui abaixo no main pelo metodo que vc criou aqui 
	
	por exemplo 
	em vez de digitar JOptionPane... vc so coloca o s
	em vez de digitar Integer.parseInt(JOptionPane...) vc so coloca o i
	*/


	//Metodo Main do IMplementar
	public static void main(String[] args) {
		Turma turma = new Turma(
				Magic.i("Numero"),
				new Aluno(
						Magic.i("RM"),
						Magic.s("Nome"),
						Magic.s("CPF")
						),
				new Professor(

						),
				new Curso(

						),
				Magic.s("Periodo"),
				Magic.s("Sala")
				);

		System.out.println(turma.toString());

	}

}
