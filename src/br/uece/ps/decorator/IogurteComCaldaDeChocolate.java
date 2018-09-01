package br.uece.ps.decorator;

public class IogurteComCaldaDeChocolate extends IogurteDecorator {

	private double custo;
	private String descricao;
	private String produtos;
	
	public IogurteComCaldaDeChocolate(Iogurte iogurteDecorado) {
		super(iogurteDecorado);
		this.custo = 1.50;
		this.produtos = "Calda de chocolate";
	}
	
	@Override
	public double getCusto() {
		return super.getCusto()+custo;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String getProdutos() {
		return super.getProdutos()+", "+produtos;
	}

}
