package br.uece.ps.decorator;

public class Aplicacao {

	public static void main(String[] args) {
		Iogurte iogurte = new IogurteBanana();
		System.out.println("Produto:"+iogurte.getProdutos());
		System.out.println("Preço:"+iogurte.getCusto());
		
		iogurte = new IogurteComCaldaDeChocolate(iogurte);
		System.out.println("Produto:"+iogurte.getProdutos());
		System.out.println("Preço:"+iogurte.getCusto());
		
		iogurte = new IogurteComCastanha(iogurte);
		System.out.println("Produto:"+iogurte.getProdutos());
		System.out.println("Preço:"+iogurte.getCusto());

	}

}
