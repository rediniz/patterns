package br.uece.ps.template;

public class StringDuplicada extends TransformaString{

	@Override
	public String transforma(String string) {
		return string + string;
	}

}
