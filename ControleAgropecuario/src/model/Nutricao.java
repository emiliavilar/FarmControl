package model;

import java.util.ArrayList;
import java.util.Date;

public class Nutricao {
	
	private ArrayList<Alimento> alimentos;
	private Date periodo;
	
	public Nutricao(ArrayList<Alimento> alimentos, Date periodo) {
		this.alimentos = alimentos;
		this.periodo = periodo;
	}

	public Date getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Date periodo) {
		this.periodo = periodo;
	}

	public ArrayList<Alimento> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(ArrayList<Alimento> alimentos) {
		this.alimentos = alimentos;
	}
	
	
	
}
