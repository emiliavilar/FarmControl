package model;

import java.util.Date;

public class Cobertura {
	
	private Date data;
	private Res touro;

	public Cobertura(Date data, Res touro) {
		this.data = data;
		this.touro = touro;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Res getTouro() {
		return touro;
	}

	public void setTouro(Res touro) {
		this.touro = touro;
	}
	
	
	

}
