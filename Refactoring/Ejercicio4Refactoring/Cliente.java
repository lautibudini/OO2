package Ejercicio4Refactoring;

import java.time.LocalDate;

public class Cliente {
	
	private LocalDate fechaAlta;
	
	public Cliente() {
		this.fechaAlta = LocalDate.now();
	}
	
	public LocalDate getFechaAlta() {
		return this.fechaAlta;
	}

}
