package br.uece.ps.chainofresponsability;

public enum TipoProduto {
	REFRIGERANTE(1.00), SALGADINHO(2.50);
	public double valorProduto;
	
	TipoProduto(double valorProduto){
		this.valorProduto = valorProduto;
	}
}
