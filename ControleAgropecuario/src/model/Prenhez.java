package model;

import java.util.Date;

public class Prenhez {
	
		private Date dataInspecao;
		private String mesGestacao;
		
		public Prenhez(Date dataInspecao, String mesGestacao) {
			this.dataInspecao = dataInspecao;
			this.mesGestacao = mesGestacao;
		}

		public Date getDataInspecao() {
			return dataInspecao;
		}

		public void setDataInspecao(Date dataInspecao) {
			this.dataInspecao = dataInspecao;
		}

		public String getMesGestacao() {
			return mesGestacao;
		}

		public void setMesGestacao(String mesGestacao) {
			this.mesGestacao = mesGestacao;
		}
		
		
		
		

}
