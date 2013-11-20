package model;

import java.util.ArrayList;

public class HistoricoFemea extends Historico{

	private ArrayList<Cobertura> coberturas;
	private ArrayList<Prenhez> prenhezes;
	private ArrayList<ProducaoLeite> producaoLeite;
	private ArrayList<Parto> partos;

	public HistoricoFemea(String dataMarcacaoFerro,
			ArrayList<Cobertura> coberturas, ArrayList<Prenhez> prenhezes,
			ArrayList<ProducaoLeite> producaoLeite, ArrayList<Parto> partos) {
		super(dataMarcacaoFerro);
		this.coberturas = coberturas;
		this.prenhezes = prenhezes;
		this.producaoLeite = producaoLeite;
		this.partos = partos;
	}

	public ArrayList<Cobertura> getCoberturas() {
		return coberturas;
	}

	public void setCoberturas(ArrayList<Cobertura> coberturas) {
		this.coberturas = coberturas;
	}

	public ArrayList<Prenhez> getPrenhezes() {
		return prenhezes;
	}

	public void setPrenhezes(ArrayList<Prenhez> prenhezes) {
		this.prenhezes = prenhezes;
	}

	public ArrayList<ProducaoLeite> getProducaoLeite() {
		return producaoLeite;
	}

	public void setProducaoLeite(ArrayList<ProducaoLeite> producaoLeite) {
		this.producaoLeite = producaoLeite;
	}

	public ArrayList<Parto> getPartos() {
		return partos;
	}

	public void setPartos(ArrayList<Parto> partos) {
		this.partos = partos;
	}

}
