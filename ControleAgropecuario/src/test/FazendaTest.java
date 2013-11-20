package test;

import model.Fazenda;
import model.Res;

public class FazendaTest {
	public static void main(String[] args) {
		
		Res res = new Res("123", "123", "M", "12/11/2013", "1234", "12345", "Nelore", "Corte", "Bezerro");
		
		Fazenda fazenda = new Fazenda();
		fazenda.addRes(res);
		System.out.println(res.toString());
	}

}
