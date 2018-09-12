/**
 * 
 */
package br.com.observer.sujeitos;

/**
 * @author Halisson.Duraes
 *
 */
public class OrdemJudicial extends Sujeito {

	private static final String ORDEM_JUDICIAL = "Ordem Judicial";
	private static OrdemJudicial instancia;
	
	/**
	 * Construtor padrão.
	 *
	 * @param nome
	 */
	private OrdemJudicial() {
		super(ORDEM_JUDICIAL);
	}

	/**
	 * @return the instancia
	 */
	public static OrdemJudicial getInstancia() {
		if(instancia == null){
			instancia = new OrdemJudicial();
		}
		return instancia;
	}
}
