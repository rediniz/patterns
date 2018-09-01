package br.uece.ps.chainofresponsability;

import java.util.Objects;

public class Moeda {

	private final TipoMoeda tipoMoeda;

	private final String descricaoMoeda;

	private boolean capturada;

	public Moeda(final TipoMoeda tipoMoeda, final String descricaoMoeda) {
		this.tipoMoeda = Objects.requireNonNull(tipoMoeda);
		this.descricaoMoeda = Objects.requireNonNull(descricaoMoeda);
	}

	public String getDescricaoMoeda() {
		return descricaoMoeda;
	}

	public TipoMoeda getTipoMoeda() {
		return tipoMoeda;
	}

	public void setCapturada() {
		this.capturada = true;
	}

	public boolean isCapturada() {
		return this.capturada;
	}

	@Override
	public String toString() {
		return getDescricaoMoeda();
	}

}
