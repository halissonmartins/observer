/**
 * 
 */
package br.com.observer.enuns;

/**
 * @author Halisson.Duraes
 *
 */
public enum Tipo {
	
	OBTER_SALDO("Obter Saldo"),
	ADICIONAR("Adicionar"),
	REMOVER("Remover");

	private String descricao;

	/**
	 * Construtor padrão.
	 *
	 * @param descricao
	 */
	private Tipo(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
}
