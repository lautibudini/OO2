package ar.unlp.edu.objetos.uno.Ejercicio2Patrones;

import java.time.LocalDate;

public abstract class Empleado {
	
	public abstract double getAdicional();
	public abstract double getBasico();
	
	public double sueldo() {
		return this.getBasico()	+ this.getAdicional() - this.getDescuento();
		
	}
	
	public double getDescuento() {
		return this.getBasico()*0.13 + this.getAdicional()*0.05;
	}
	
}
