package br.uece.ps.bridge;

import java.util.ArrayList;

public class NaoOrdenada extends ListaAbstracao{
	private ArrayList<String> lista = new ArrayList<String>();
	
	public NaoOrdenada(MontaItensImplementacao montaItens) {
		super(montaItens);
	}
	
	@Override
	public void adicionar(String s) {
	    lista.add(montaItens.montaIconeLista(s));
	}

	@Override
	public void imprimir() {
	    System.out.println("Lista Nao Ordenada:");
	    for (String element : lista) {
		System.out.println(element);
	    }
	}
	
}
