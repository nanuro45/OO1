package ar.edu.unlp.info.oo1.IntervaloTiempo;

import java.time.Duration;
import java.time.LocalDate;

public class Tiempo {
	private LocalDate from;
	private LocalDate to;
	
	public LocalDate getFrom() {
		return this.from;
	}
	public LocalDate getTo() {
		return this.to;
	}
	public int sizeInDays() {
		return (int) Duration.between(from, to).toDays();
	}
	
	public boolean includesDate (LocalDate other) {
		return other.isAfter(this.getFrom()) && other.isBefore(this.getTo()) ||
				other.equals(this.getFrom()) || other.equals(this.getTo());
	}
} 
