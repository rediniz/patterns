package br.uece.ps.bridge;

public class Enumerado extends MontaItensImplementacao{
    
    private int count = 0;
    
    @Override
    public String montaIconeLista(String s) {
	if(s != null){
	    count++;
	}
	return String.valueOf(count) + " " + s;
    }
	
}
