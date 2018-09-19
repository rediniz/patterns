package br.uece.ps.bridge;

public abstract class ListaAbstracao {
	MontaItensImplementacao montaItens;

	public ListaAbstracao(MontaItensImplementacao montaItens) {
		this.montaItens = montaItens;
	}
	
	public abstract void adicionar(String s);
	
	public abstract void imprimir(); 
	
}
