package model;

import java.util.ArrayList;

public class Historico {
	
	private ArrayList<Vacinacao> vacinacoes;
	private ArrayList<Nutricao> nutricoes;
	private ArrayList<Peso> pesos;
	private String dataMarcacaoFerro;
	
	public Historico(String dataMarcacaoFerro) {
		this.dataMarcacaoFerro = dataMarcacaoFerro;
		//this.nutricoes = new ArrayList<Nutricao>();
		//this.pesos = new ArrayList<Peso>();
		//this.setVacinacoes(new ArrayList<Vacinacao>());
	}

	public ArrayList<Vacinacao> getVacinacoes() {
		return vacinacoes;
	}

	public void setVacinacoes(ArrayList<Vacinacao> vacinacoes) {
		this.vacinacoes = vacinacoes;
	}

	public ArrayList<Nutricao> getNutricoes() {
		return nutricoes;
	}

	public void setNutricoes(ArrayList<Nutricao> nutricoes) {
		this.nutricoes = nutricoes;
	}

	public ArrayList<Peso> getPesos() {
		return pesos;
	}

	public void setPesos(ArrayList<Peso> pesos) {
		this.pesos = pesos;
	}

	public String getDataMarcacaoFerro() {
		return dataMarcacaoFerro;
	}

	public void setDataMarcacaoFerro(String dataMarcacaoFerro) {
		this.dataMarcacaoFerro = dataMarcacaoFerro;
	}	

}
