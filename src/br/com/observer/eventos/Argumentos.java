package br.com.observer.eventos;

import java.math.BigDecimal;

public class Argumentos {
	
	private String cpf;
	private BigDecimal valor;

	/**
	 * Construtor padrão.
	 *
	 * @param cpf
	 * @param valor
	 * @param tipo
	 */
	public Argumentos(String cpf, BigDecimal valor) {
		super();
		this.cpf = cpf;
		this.valor = valor;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
