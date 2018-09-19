package br.uece.ps;

import br.uece.ps.observer.Alarme;
import br.uece.ps.observer.CiaSeguros;
import br.uece.ps.observer.Delegacia;
import br.uece.ps.singleton.Logger;
import br.uece.ps.template.StringDuplicada;
import br.uece.ps.template.StringInvertida;
import br.uece.ps.template.StringMaiuscula;
import br.uece.ps.template.StringMinuscula;

public class Main {
	public static void main(String[] args) {
		//Questão 1 - Singleton
		Logger logger = Logger.getInstance();
		logger.setAtivo(true);
		logger.log("Log");
		
		//Questao 8 - Template
		System.out.println(new StringInvertida().transforma("Teste"));
		System.out.println(new StringDuplicada().transforma("Teste"));
		System.out.println(new StringMinuscula().transforma("Teste"));
		System.out.println(new StringMaiuscula().transforma("Teste"));

		//Questão 7 - Observer
		Alarme alarme = new Alarme();
		CiaSeguros ciaSeguros = new CiaSeguros(alarme);
		Delegacia delegacia = new Delegacia(alarme);

		alarme.detectaMovimento();
	}
}
