package br.uece.ps.chainofresponsability;

public enum TipoMoeda {
	MOEDA_5_CENTAVOS(0.05), MOEDA_10_CENTAVOS(0.10), MOEDA_25_CENTAVOS(0.25), MOEDA_50_CENTAVOS(0.50), MOEDA_1_REAL(1);
	public double valorMoeda;
	
	TipoMoeda(double valorMoeda){
		this.valorMoeda = valorMoeda;
	}
}
