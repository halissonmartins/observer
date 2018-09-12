package br.com.observer.sujeitos;

import br.com.observer.eventos.Argumentos;
import br.com.observer.observadores.IObservador;

public interface ISujeito {
	
	String getNome();

	void notificarTodos(Argumentos argumentos);

	void registrar(IObservador observador);

	void cancelar(IObservador observador);

}