package ar.unlp.edu.objetos.uno.Ejercicio9_Patrones;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
	
	private int cantDias;
	private LocalDate fechaInicio;
	private Usuario conductor;
	private AutoEnAlquiler auto;
	
	public Reserva(int cantDias, LocalDate fechaInicio, 
			Usuario conductor, AutoEnAlquiler auto) {
		this.cantDias = cantDias;
		this.fechaInicio = fechaInicio;
		this.conductor = conductor;
		this.auto = auto;
	}
	
	
	public double montoAPagar() {
		return this.cantDias * this.auto.getPrecioPorDia();
	}
	

	public double montoAReembolsar(LocalDate fechaTentativa) {
		//Da un número positivo si f2 es posterior, o negativo si f1 es posterior.
		int dias = (int) ChronoUnit.DAYS.between(this.fechaInicio, fechaTentativa);
		if (dias > 0) {
			return this.auto.calcularReembolso(this.montoAPagar(), dias);
		}
		return 0;
	}
}
