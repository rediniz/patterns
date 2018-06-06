package br.uece.ps.strategy;

public class Logger {

	private LoggerStrategy strategy;
	private boolean ativo = false;
	
	public Logger(LoggerStrategy strategy) {
		this.strategy = strategy;
	}
	
	public boolean isAtivo() {
		return this.ativo;
	}
	
	public void setAtivo(boolean b) {
		this.ativo = b;
	}
	
	public void changeStrategy(LoggerStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void log(String s) {
		strategy.execute(s);
	}
}
