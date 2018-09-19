package br.uece.ps.adapter;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter extends SomadorExistente {
	private SomadorExistente somadorExistente;
	
	public SomadorAdapter(SomadorExistente somadorExistente) {
		this.somadorExistente = somadorExistente;
	}
	
	public int somaLista(int[] lista) {		
		List<Integer> intList = new ArrayList<Integer>();
		for (int i : lista)
		{
		    intList.add(i);
		}
		
		return somadorExistente.somaLista(intList);
	}
}
