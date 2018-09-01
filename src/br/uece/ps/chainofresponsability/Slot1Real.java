package br.uece.ps.chainofresponsability;

public class Slot1Real extends Slot {

	public Slot1Real(Slot slot) {
		super(slot);
	}

	@Override
	public double capturarMoeda(Moeda moeda) {
		if (moeda.getTipoMoeda().equals(TipoMoeda.MOEDA_1_REAL)) {
			System.out.println("Capturou moeda de 1 real");
			moeda.setCapturada();
			return moeda.getTipoMoeda().valorMoeda;
		} else {
			return super.capturarMoeda(moeda);
		}
	}

}