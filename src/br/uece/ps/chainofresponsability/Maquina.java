package br.uece.ps.chainofresponsability;

public class Maquina {
	Slot chain;
	private TipoProduto tipoProduto;
	private double valorMoedas = 0.0;
	

	public Maquina() {
		buildChain();
	}
	
	public void setProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	private void buildChain() {
		chain = new Slot1Real(new Slot50Centavos(new Slot25Centavos(new Slot10Centavos(new Slot5Centavos(null)))));
	}

	public void inserirMoeda(Moeda moeda) {
		valorMoedas +=  chain.capturarMoeda(moeda);
		
		if(valorMoedas >= tipoProduto.valorProduto) {
			System.out.println("Entregando o produto: " + tipoProduto.toString());
			calcularTroco();
		} else {
			System.out.println("Insira mais moedas.");
		}
	}
	
	private void calcularTroco() {
		double troco = valorMoedas-tipoProduto.valorProduto;
		long reais;
		double centavos;
		
		reais = (long)troco;
		centavos = (troco - reais)*100;
		
		String infoTroco = "Troco a receber: ";
		
		if(reais > 0) {
			infoTroco += reais + " real(is) ";
		}
		if(centavos > 0) {
			infoTroco += "" + (int)centavos + " centavos ";
		}
		System.out.println(infoTroco);
	}
}