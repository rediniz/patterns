package br.uece.ps.chainofresponsability;

public class Aplicacao {

	public static void main(String[] args) {
		Maquina maquina = new Maquina();
		maquina.setProduto(TipoProduto.REFRIGERANTE);
		
		maquina.inserirMoeda(new Moeda(TipoMoeda.MOEDA_50_CENTAVOS, "50 centavos"));
		maquina.inserirMoeda(new Moeda(TipoMoeda.MOEDA_1_REAL, "1 real"));
		
	}
}
