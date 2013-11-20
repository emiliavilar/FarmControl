package model;

public class Res {
	
	private String id;
	private String numeroId;
	private String sexo;
	private String dataNasc;
	private String mae;
	private String pai;
	private String raca;
	private String aptidao;
	private String status;
	private Historico historico;
	
	public Res(String id, String numeroId, String sexo, String dataNasc,
			String mae, String pai, String raca, String aptidão, String status) {
		this.id = id;
		this.numeroId = numeroId;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.mae = mae;
		this.pai = pai;
		this.raca = raca;
		this.aptidao = aptidão;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(String numeroId) {
		this.numeroId = numeroId;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getAptidão() {
		return aptidao;
	}

	public void setAptidão(String aptidão) {
		this.aptidao = aptidão;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Historico getHistorico() {
		return historico;
	}

	public void setHistorico(Historico historico) {
		this.historico = historico;
	}
	
	public String toString(){
		return "ID:" + id + " Numero ID:" + numeroId + " Sexo:" + sexo + " Data de NAscimento:" + dataNasc +
				" ID Mãe:" + mae + " ID Pai:" + pai + " Raça:" + raca + " Aptidão:" + aptidao + " Status:" + status;
	}

}
