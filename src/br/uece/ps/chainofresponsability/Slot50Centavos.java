package br.uece.ps.chainofresponsability;

public class Slot50Centavos extends Slot {

	public Slot50Centavos(Slot slot) {
		super(slot);
	}

	@Override
	public double capturarMoeda(Moeda moeda) {
		if (moeda.getTipoMoeda().equals(TipoMoeda.MOEDA_50_CENTAVOS)) {
			System.out.println("Capturou moeda de 50 centavos");
			moeda.setCapturada();
			return moeda.getTipoMoeda().valorMoeda;
		} else {
			return super.capturarMoeda(moeda);
		}
	}

}