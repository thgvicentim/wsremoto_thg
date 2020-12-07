package br.com.universidadexyz.util;

import javax.swing.JOptionPane;

public class Magic {
	
	
	//Meto estatico nao tem vinculo com atributos
	//vc pode chamar direto sem instanciar para usar ele em outras classes sem problemas
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toLowerCase();
	}

	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static short sh(String msg) {
		return Short.parseShort(s(msg));
	}

	
	
	
	
	

}
