package br.uece.ps.bridge;

public class Marcador extends MontaItensImplementacao{
	@Override
	public String montaIconeLista(String s) {
		return "*" + " " + s;
	}

}
