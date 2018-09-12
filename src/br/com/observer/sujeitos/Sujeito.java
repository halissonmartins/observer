/**
 * 
 */
package br.com.observer.sujeitos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import br.com.observer.eventos.Argumentos;
import br.com.observer.observadores.IObservador;

/**
 * @author Halisson.Duraes
 *
 */
public abstract class Sujeito implements ISujeito{
	
	private String nome;	
	private Set<IObservador> observadores = null;
	
	/**
	 * Construtor padrão.
	 *
	 * @param nome
	 */
	public Sujeito(String nome) {
		super();
		this.nome = nome;
		observadores = new HashSet<IObservador>();
	}

	@Override
	public String getNome() {
		return nome;
	}
	
	/**
	 * @return the observadores
	 */
	public Set<IObservador> getObservadores() {
		return observadores;
	}

	@Override
	public void notificarTodos(Argumentos argumentos) {
		if(!observadores.isEmpty()){			
			for (Iterator<IObservador> iterator = observadores.iterator(); iterator.hasNext();) {
				IObservador observador = iterator.next();
				observador.atualizar(argumentos);
			}
		}
	}

	@Override
	public void registrar(IObservador observador) {
		observadores.add(observador);
		System.out.println("#Registrado: " + observador.getNome());
	}

	@Override
	public void cancelar(IObservador observador) {
		observadores.remove(observador);
		System.out.println("#Cancelado: " + observador.getNome());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sujeito other = (Sujeito) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
