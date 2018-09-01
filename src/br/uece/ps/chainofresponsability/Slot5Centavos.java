package br.uece.ps.chainofresponsability;

public class Slot5Centavos extends Slot {

	public Slot5Centavos(Slot slot) {
		super(slot);
	}

	@Override
	public double capturarMoeda(Moeda moeda) {
		if (moeda.getTipoMoeda().equals(TipoMoeda.MOEDA_5_CENTAVOS)) {
			System.out.println("Capturou moeda de 5 centavos");
			moeda.setCapturada();
			return moeda.getTipoMoeda().valorMoeda;
		} else {
			return super.capturarMoeda(moeda);
		}
	}

}