package br.uece.ps.template;

public class StringMaiuscula extends TransformaString{

	@Override
	public String transforma(String string) {
		return string.toUpperCase();
	}

}
