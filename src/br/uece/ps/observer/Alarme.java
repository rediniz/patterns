package br.uece.ps.observer;

import java.util.Observable;

public class Alarme extends Observable{

	public void detectaMovimento() {
		setChanged();
		notifyObservers();
	}
}
