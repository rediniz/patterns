package br.uece.ps.bridge;


public class Alfabeto extends MontaItensImplementacao{
    
    private char[] alfabeto = {'a','b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'z'};
    private int count = 0; 
    
    @Override
    public String montaIconeLista(String s) {
	if(s != null){
	    count++;
	}
	return alfabeto[count-1] + " " + s;
    }

}
