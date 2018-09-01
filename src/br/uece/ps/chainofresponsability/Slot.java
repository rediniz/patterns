package br.uece.ps.chainofresponsability;

public abstract class Slot {

	private Slot proximo;

	public Slot(Slot proximo) {
		this.proximo = proximo;
	}

	public double capturarMoeda(Moeda moeda) {
		if (proximo != null) {
			return proximo.capturarMoeda(moeda);
		}
		return moeda.getTipoMoeda().valorMoeda;
	}
}