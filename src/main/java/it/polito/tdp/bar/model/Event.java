package it.polito.tdp.bar.model;

import java.time.Duration;

public class Event implements Comparable<Event> {

	public enum EventType {
		ARRIVO_GRUPPO_CLIENTI,
		TAVOLO_LIBERATO
	}
	
	private EventType type;
	private Duration time;
	private int num_persone;
	private Duration durata;
	private double tolleranza;
	private Tavolo tavolo;
	
	public Event(EventType type, Duration time, int num_persone, Duration durata, double tolleranza, Tavolo tavolo) {
		this.type = type;
		this.time = time;
		this.num_persone = num_persone;
		this.durata = durata;
		this.tolleranza = tolleranza;
		this.tavolo = tavolo;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public Duration getTime() {
		return time;
	}

	public void setTime(Duration time) {
		this.time = time;
	}

	public int getNum_persone() {
		return num_persone;
	}

	public void setNum_persone(int num_persone) {
		this.num_persone = num_persone;
	}

	public Duration getDurata() {
		return durata;
	}

	public void setDurata(Duration durata) {
		this.durata = durata;
	}

	public double getTolleranza() {
		return tolleranza;
	}

	public void setTolleranza(double tolleranza) {
		this.tolleranza = tolleranza;
	}

	public Tavolo getTavolo() {
		return tavolo;
	}

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}

	@Override
	public String toString() {
		return "Event [type=" + type + ", time=" + time + ", num_persone=" + num_persone + ", durata=" + durata
				+ ", tolleranza=" + tolleranza + ", tavolo=" + tavolo + "]";
	}

	@Override
	public int compareTo(Event e) {
		return this.time.compareTo(e.getTime());
	}
	
}
