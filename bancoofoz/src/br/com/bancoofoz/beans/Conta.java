package br.com.bancoofoz.beans;

public class Conta {

	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;
	
	public short getNumero() {
		return numero;
	}
	
	public void setNumero(short numero) {
		this.numero = numero;
	}
	
	public byte getDigito() {
		return digito;
	}
	
	public void setDigito(byte digito) {
		this.digito = digito;
	}
	
	public short getAgencia() {
		return agencia;
	}
	
	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public Conta() {
		super();
	}
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", digito=" + digito + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", cliente=" + cliente + "]";
	}
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}



	
	
	
	
	
}
