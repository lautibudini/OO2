package ar.unlp.edu.objetos.uno.Ejercicio2Patrones;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmpleadoPlanta extends EmpleadoConInformacion{

	private LocalDate ingreso;
	
	

	public EmpleadoPlanta(int cantHijos, boolean casado, LocalDate ingreso) {
		super(cantHijos, casado);
		this.ingreso = ingreso;
	}

	@Override
	public double getAdicional() {
		 return super.getAdicional() + (this.getAñosAntiguedad()*2000);
	}

	@Override
	public double getBasico() {
		return 50000;
	}
	
	private int getAñosAntiguedad() {
		return (int) ChronoUnit.YEARS.between(this.ingreso, LocalDate.now());
	}
	

}
