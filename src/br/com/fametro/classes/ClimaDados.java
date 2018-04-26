package br.com.fametro.classes;

import java.util.ArrayList;

public class ClimaDados implements Subject{
	
	private ArrayList observers;
	private float temp;
	private float umid;
	private float pressao;
	
	public ClimaDados() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(o);
		}
	}

	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer obs = (Observer) observers.get(i);
			obs.update(temp, umid, pressao);
		}
	}
	
	
	public void setMedidas(float t, float u, float p) {
		this.temp = t;
		this.umid = u;
		pressao = p;
	}
	
	
	
}
