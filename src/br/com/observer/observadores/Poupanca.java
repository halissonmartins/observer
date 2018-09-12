package br.com.observer.observadores;

import br.com.observer.eventos.Argumentos;

public class Poupanca extends Observador {
	
	private static Poupanca instancia;

	private Poupanca() {
		super("Poupança");
	}
	
	public static Poupanca getInstancia() {
		if(instancia == null){
			instancia = new Poupanca();
		}
		return instancia;
	}
	
	@Override
	public void atualizar(Argumentos argumentos) {
		System.out.println(getNome() + " -> CPF bloqueado: " + argumentos.getCpf());
	}

}
