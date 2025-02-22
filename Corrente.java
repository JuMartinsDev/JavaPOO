package br.com.fiap.banco.model;

public class Corrente extends Conta {

	private double limite;
	
	public Corrente(Cliente cliente, double saldo) {
		super(cliente, saldo); //super é uma refrência para a classe pai
	}

	public Corrente(Cliente cliente, double saldo, double limite) {
		this(cliente, saldo);
		this.limite=limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//atualização do saldo
	public void sacar(double valor) throws Exception{
		if(valor <= this.getSaldo()) {
			super.sacar(valor);
		}else {
			double delta = valor - this.getSaldo();
			this.setSaldo(0);
			limite = limite - delta;
		}
	}
	
	public void depositar(double valor) {
		if(limite <0) {
			limite = limite + valor;
		}else {
			super.depositar(valor);
		}
	}
	
	
}
