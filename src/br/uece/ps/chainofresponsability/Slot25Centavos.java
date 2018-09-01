package br.uece.ps.chainofresponsability;

public class Slot25Centavos extends Slot {

	public Slot25Centavos(Slot slot) {
		super(slot);
	}

	@Override
	public double capturarMoeda(Moeda moeda) {
		if (moeda.getTipoMoeda().equals(TipoMoeda.MOEDA_25_CENTAVOS)) {
			System.out.println("Capturou moeda de 25 centavos");
			moeda.setCapturada();
			return moeda.getTipoMoeda().valorMoeda;
		} else {
			return super.capturarMoeda(moeda);
		}
	}

}