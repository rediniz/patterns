package br.uece.ps;

import br.uece.ps.bridge.Alfabeto;
import br.uece.ps.bridge.Enumerado;
import br.uece.ps.bridge.ListaAbstracao;
import br.uece.ps.bridge.Marcador;
import br.uece.ps.bridge.NaoOrdenada;
import br.uece.ps.bridge.Ordenada;
import br.uece.ps.composite.Congresso;
import br.uece.ps.composite.Individuo;
import br.uece.ps.composite.Instituicao;
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
		
		//Questão 9 
		Congresso congresso = new Congresso();
		congresso.inscrever(new Individuo());
		congresso.inscrever(new Individuo());
		congresso.inscrever(new Instituicao());
		congresso.inscrever(new Individuo());
		
		congresso.imprimirParticipantes();
		
		//Questão 10
		ListaAbstracao li = new NaoOrdenada(new Marcador());
		li.adicionar("teste");
		li.adicionar("teste2");
		li.adicionar("teste3");
		li.imprimir();
		
		ListaAbstracao liEnu = new Ordenada(new Enumerado());
		liEnu.adicionar("teste");
		liEnu.adicionar("teste2");
		liEnu.adicionar("teste3");
		liEnu.imprimir();
		
		ListaAbstracao liAfa = new Ordenada(new Alfabeto());
		liAfa.adicionar("teste");
		liAfa.adicionar("teste2");
		liAfa.adicionar("teste3");
		liAfa.imprimir();
	}
}
