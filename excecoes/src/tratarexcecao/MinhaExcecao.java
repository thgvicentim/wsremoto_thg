package tratarexcecao;

public class MinhaExcecao {
	
	
	
	public static String tratar(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto Nulo";
		}else if (e instanceof NumberFormatException) {
			return "Numero invalido";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			e.printStackTrace();
			return "Excecao desconhecida";
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}//fecha o metodo
	
	
	
	

} // Fecha a classe
