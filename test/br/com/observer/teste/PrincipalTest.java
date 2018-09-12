package br.com.observer.teste;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.observer.eventos.Argumentos;
import br.com.observer.observadores.ContaCorrente;
import br.com.observer.observadores.Investimento;
import br.com.observer.observadores.Poupanca;
import br.com.observer.sujeitos.OrdemJudicial;

public class PrincipalTest {

	@Test
	public void test() {
		OrdemJudicial ordemJudicial = OrdemJudicial.getInstancia();
		
		ordemJudicial.notificarTodos(new Argumentos("012.345.678-90", BigDecimal.ONE));
		
		ContaCorrente contaCorrente = ContaCorrente.getInstancia();
		Poupanca poupanca = Poupanca.getInstancia();
		Investimento investimento = Investimento.getInstancia();
		
		ordemJudicial.registrar(contaCorrente);
		ordemJudicial.registrar(poupanca);
		
		ordemJudicial.notificarTodos(new Argumentos("012.345.678-90", BigDecimal.TEN));
		
		ordemJudicial.registrar(investimento);
		
		ordemJudicial.notificarTodos(new Argumentos("012.345.678-90", BigDecimal.ONE));
		
		ordemJudicial.cancelar(poupanca);
		
		ordemJudicial.notificarTodos(new Argumentos("184.176.049-87", BigDecimal.TEN));
		
	}

}
