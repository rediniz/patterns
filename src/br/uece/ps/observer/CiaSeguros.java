package br.uece.ps.observer;

import java.util.Observable;
import java.util.Observer;

public class CiaSeguros implements Observer {
    private Observable alarme;
	
	public CiaSeguros(Observable observable) {
		alarme = observable;
		alarme.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("--Cia de seguros notificada--");
	}
}
