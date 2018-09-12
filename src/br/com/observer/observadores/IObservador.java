package br.com.observer.observadores;

import br.com.observer.eventos.Argumentos;

public interface IObservador {

	String getNome();
	
	void atualizar(Argumentos argumentos);
	
}
