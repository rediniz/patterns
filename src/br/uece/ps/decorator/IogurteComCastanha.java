package br.uece.ps.decorator;

public class IogurteComCastanha extends IogurteDecorator {

	private double custo;
	private String descricao;
	private String produtos;
	
	public IogurteComCastanha(Iogurte iogurteDecorado) {
		super(iogurteDecorado);
		this.custo = 0.50;
		this.produtos = "Castanha";
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
