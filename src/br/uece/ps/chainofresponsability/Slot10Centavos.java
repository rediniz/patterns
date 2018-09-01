package br.uece.ps.chainofresponsability;

public class Slot10Centavos extends Slot {

	public Slot10Centavos(Slot slot) {
		super(slot);
	}

	@Override
	public double capturarMoeda(Moeda moeda) {
		if (moeda.getTipoMoeda().equals(TipoMoeda.MOEDA_10_CENTAVOS)) {
			System.out.println("Capturou moeda de 10 centavos");
			moeda.setCapturada();
			return moeda.getTipoMoeda().valorMoeda;
		} else {
			return super.capturarMoeda(moeda);
		}
	}

}