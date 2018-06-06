package br.uece.ps.strategy;

public class LoggerFile implements LoggerStrategy {

	@Override
	public void execute(String s) {
		System.out.println("A mensagem '"+s+"' foi salva em um arquivo.");
	}

}
