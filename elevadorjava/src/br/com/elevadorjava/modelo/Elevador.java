package br.com.elevadorjava.modelo;

public class Elevador {

	//atributos (Caracteristicas)
	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private byte capacidadePessoas;
	private byte qtdeAtual;
	private short andarAtual;
	
	//metodos(comportamentos)
	//<modificador> <tipo do retorno> <nomDoMetodo> (<tipoParam> <nome do param>){
	
	//Descer escolhendo o andar que deseja
	//Um metodo pode ter o mesmo nome desde que tenham parametros diferentes como e o caso desser descer
	public void descer(short andar) {
		if (andar>=andarMinimo) {
			andarAtual=andar;
		}
	}
	
	
	//subir escolhendo o andar que deseja
	//Um metodo pode ter o mesmo nome desde que tenham parametros diferentes como e o caso desse subir
	public void subir(short andar) {
		if (andar<=andarMaximo) {
			andarAtual=andar;
		}
	}	
	
	
	//O Metodo Sair() devera retirar a qtde de pessoas informada no parametro do atributo qtdeAtual, mas nao
	//pode ficar um valor negativo
	//Errei feio
	public void sair(byte pQtde) {
		byte resultado= (byte) (qtdeAtual - pQtde);
		if (resultado>0) {
			qtdeAtual-=pQtde;
		}
	}
	
	
	//O metodo entra() devera atribuir a qtde de pessoas recebida no parametro, no astributo qtdeAtual 
	//E nao devera exceder a capacidade de pessoas
	// Errei
	public void entrar(byte pQtde) {
		 /*byte total = (byte) (qtdeAtual + pQtde);	// uma forma seria essa para fim didatico
		 //if (total<=capacidadePessoas) {	 
		 }*/
		
		byte total= (byte) (qtdeAtual + pQtde);
		if (total<=capacidadePessoas) {
			qtdeAtual+=pQtde;
		}
	}
	
	
	//O metodo exibirDados() devera exibir, nome do Elevador, o andar que ele esta e a qtde de pessoas
	//Acertei
	public String exibirDados() {
		return 
				"Nome do elevador..: " + nome + "\n" +
			    "Andar Atual.......: " + andarAtual + "\n" + 
				"A qtde de pessoas.: " + qtdeAtual;
	}
	
	
	//O metodo descer() devera descer um andar, mas nao deve descer alem do minimo
	//Errei
	public void descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
		}
	}
	
	
	//O metodo subir() devera subir um andar, mas nao deve passar do andarMaximo
	// Errei
	public void subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
		}
	}
	
	
	//O metodo definirvalores devera preencher os atributos nome, andarMaximo, andarMinimo e capacidade
	//Fiz correto
	public void definirValores(String pNome, short pAndarMax, short pAndarMin, byte pCapacidade) {
		nome = pNome;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = pCapacidade;
	}
	
	
	

	

	
	
	
	
	
	
}
