package br.uece.ps.decorator;

public class IogurteDecorator implements Iogurte {

	protected Iogurte iogurteDecorado;
	
	public IogurteDecorator(Iogurte iogurteDecorado) {
		this.iogurteDecorado = iogurteDecorado;
	}
	@Override
	public double getCusto() {
		return iogurteDecorado.getCusto();
	}

	@Override
	public String getDescricao() {
		return iogurteDecorado.getDescricao();
	}
	
	@Override
	public String getProdutos() {
		return iogurteDecorado.getProdutos();
	}

}
