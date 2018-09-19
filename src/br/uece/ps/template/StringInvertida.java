package br.uece.ps.template;

public class StringInvertida extends TransformaString{

	@Override
	public String transforma(String string) {
		return new StringBuilder(string).reverse().toString();
	}

}
