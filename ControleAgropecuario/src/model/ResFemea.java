package model;

public class ResFemea extends Res {
	
	private HistoricoFemea historicoVaca;

	public ResFemea(String id, String numeroId, String sexo, String dataNasc,
			String mae, String pai, String raca, String aptidão, String status) {
		super(id, numeroId, sexo, dataNasc, mae, pai, raca, aptidão, status);
	}

	public HistoricoFemea getHistoricoVaca() {
		return historicoVaca;
	}

	public void setHistoricoVaca(HistoricoFemea historicoVaca) {
		this.historicoVaca = historicoVaca;
	}
	
}
