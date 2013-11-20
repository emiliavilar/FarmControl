package model;

import java.util.Date;

public class Vacinacao {
	
	private String tipoVacina;
	private Date data;
	
	public Vacinacao(String tipoVacina, Date data) {
		this.tipoVacina = tipoVacina;
		this.data = data;
	}

	public String getTipoVacina() {
		return tipoVacina;
	}

	public void setTipoVacina(String tipoVacina) {
		this.tipoVacina = tipoVacina;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}	

}
