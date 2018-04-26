package br.com.fametro.classes;

public class Estatisticas implements Observer, ExibeElemento{

	private float temp;
	private float umid;
	private float pressao;
	private Subject climaDados;
	
	public Estatisticas(Subject climaDados) {
		this.climaDados = climaDados;
		climaDados.registerObserver(this);
	}

	public void exibir() {
		System.out.println("ESTAT�STICAS: " + temp + " �C E " + umid + " % DE UMIDADE E " + pressao + " DE PRESS�O!");	
	}

	public void update(float temp, float umid, float pressao) {
		this.temp = temp;
		this.umid = umid ;
		this.pressao = pressao;
		exibir();
	
	}
	
	

}
