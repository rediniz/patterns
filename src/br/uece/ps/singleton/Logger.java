package br.uece.ps.singleton;

public final class Logger {
	private boolean ativo = false;
	private static Logger logger;
	
	private Logger() {}
	
	public static Logger getInstance() {
		if(logger == null) {
			logger = new Logger();
		}
		
		return logger;
	}

	public void log(String s) {
		if(ativo) {
			System.out.println("LOG::" + s);
		}
	}
	
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	
}
