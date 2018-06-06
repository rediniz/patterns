package br.uece.ps.strategy;

public class LoggerEventViewer implements LoggerStrategy {

	@Override
	public void execute(String s) {
		System.out.println("A mensagem '"+s+"' foi salva no visualizador de eventos.");	
	}

}
