package br.uece.ps.strategy;

public class LoggerDatabase implements LoggerStrategy {

	@Override
	public void execute(String s) {
		System.out.println("A mensagem '"+s+"' foi salva no banco de dados.");
	}

}
