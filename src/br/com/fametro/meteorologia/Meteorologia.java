package br.com.fametro.meteorologia;

import br.com.fametro.classes.*;


public class Meteorologia {
	
	public static void main(String[] args) {
		
		ClimaDados climaDados = new ClimaDados();
		
		CondicoesAtuais condicoesAtuais = new CondicoesAtuais(climaDados);
		Estatisticas estaticas = new Estatisticas(climaDados);
		PrevisaoTempo previsao = new PrevisaoTempo(climaDados);
		
		System.out.println("--------------------------------------------");
		System.out.println("PRIMEIRA LEITURA");
		System.out.println("--------------------------------------------");

		//Envia os primeiros dados
		climaDados.setMedidas(23, 47, 45);
		climaDados.notifyObserver();
		
		System.out.println("--------------------------------------------");
		System.out.println("SEGUNDA LEITURA");
		System.out.println("--------------------------------------------");
		
		// Envia novos dados
		climaDados.setMedidas(27, 55, 40);
		climaDados.notifyObserver();

		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		
	}

}
