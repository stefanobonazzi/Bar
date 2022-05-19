package it.polito.tdp.bar.model;

public class Model {

	private Simulator sim;
	private Statistiche stat;
	
	public Model() {
		sim = new Simulator();
	}
	
	public void simula() {
		sim.initialize();
		sim.run();
		
		stat = sim.getStatistiche();
	}

	public Statistiche getStatistiche() {
		return this.stat;
	}
}
