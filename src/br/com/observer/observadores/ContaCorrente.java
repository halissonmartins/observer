package br.com.observer.observadores;

import br.com.observer.eventos.Argumentos;

public class ContaCorrente extends Observador {
	
	private static ContaCorrente instancia;

	private ContaCorrente() {
		super("Conta Corrente");
	}

	public static ContaCorrente getInstancia() {
		if(instancia == null){
			instancia = new ContaCorrente();
		}
		return instancia;
	}
	
	@Override
	public void atualizar(Argumentos argumentos) {
		System.out.println(getNome() + " -> CPF bloqueado: " + argumentos.getCpf());
	}

}
