package model;

import java.util.Date;

public class ProducaoLeite {
	
	private Date data;
	private double qtdLeite;
	
	public ProducaoLeite(Date data, double qtdLeite) {
		this.data = data;
		this.qtdLeite = qtdLeite;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getQtdLeite() {
		return qtdLeite;
	}

	public void setQtdLeite(double qtdLeite) {
		this.qtdLeite = qtdLeite;
	}
	
	
	
	

}
