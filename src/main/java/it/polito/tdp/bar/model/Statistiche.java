package it.polito.tdp.bar.model;

public class Statistiche {

	private int clientiTot;
	private int clientiSoddisfatti;
	private int clientiInsoddisfatti;
	
	public Statistiche() {
		this.clientiTot = 0;
		this.clientiSoddisfatti = 0;
		this.clientiInsoddisfatti = 0;
	}

	public int getClientiTot() {
		return clientiTot;
	}

	public void increaseClientiTot(int clientiTot) {
		this.clientiTot += clientiTot;
	}

	public int getClientiSoddisfatti() {
		return clientiSoddisfatti;
	}

	public void increaseClientiSoddisfatti(int clientiSoddisfatti) {
		this.clientiSoddisfatti += clientiSoddisfatti;
	}

	public int getClientiInsoddisfatti() {
		return clientiInsoddisfatti;
	}

	public void increaseClientiInsoddisfatti(int clientiInsoddisfatti) {
		this.clientiInsoddisfatti += clientiInsoddisfatti;
	}
	
}
