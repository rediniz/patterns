package br.uece.ps;

import br.uece.ps.observer.Alarme;
import br.uece.ps.observer.CiaSeguros;
import br.uece.ps.observer.Delegacia;
import br.uece.ps.singleton.Logger;

public class Main {
	public static void main(String[] args) {
		//Questão 1 - Singleton
		Logger logger = Logger.getInstance();
		logger.setAtivo(true);
		logger.log("Log");
		
		//Questão 7 - Observer
		Alarme alarme = new Alarme();
		CiaSeguros ciaSeguros = new CiaSeguros(alarme);
		Delegacia delegacia = new Delegacia(alarme);

		alarme.detectaMovimento();
	}
}
