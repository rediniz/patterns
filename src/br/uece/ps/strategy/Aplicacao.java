package br.uece.ps.strategy;

public class Aplicacao {

	public static void main(String[] args) {
		Logger log1 = new Logger(new LoggerEventViewer());
		log1.setAtivo(true);
		log1.log("PRIMEIRA MENSAGEM DE LOG");
		Logger log2 = new Logger(new LoggerFile());
		log2.log("SEGUNDA MENSAGEM DE LOG");
		Logger log3 = new Logger(new LoggerDatabase());
		log3.log("TERCEIRA MENSAGEM DE LOG");

	}

}
