package br.com.observer.observadores;

import br.com.observer.eventos.Argumentos;

public class Investimento extends Observador {

	private static Investimento instancia;
	
	private Investimento() {
		super("Investimento");
	}

	public static Investimento getInstancia() {
		if(instancia == null){
			instancia = new Investimento();
		}
		return instancia;
	}
	
	@Override
	public void atualizar(Argumentos argumentos) {
		System.out.println(getNome() + " -> CPF bloqueado: " + argumentos.getCpf());
	}

}
