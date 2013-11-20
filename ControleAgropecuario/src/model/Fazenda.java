package model;

import java.util.ArrayList;

public class Fazenda {

	private ArrayList<Res> rezes;

	public Fazenda(){
		this.rezes = new ArrayList<Res>();

	}	

	public void addRes(Res res){
		rezes.add(res);
	}

	public void removeRes(Res res){
		rezes.remove(res);
	}



}
