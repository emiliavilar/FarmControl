package model;

import java.util.Date;

public class Peso {

	private double peso;
	private Date data;

	public Peso(double peso, Date data) {
		this.peso = peso;
		this.data = data;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}


}
