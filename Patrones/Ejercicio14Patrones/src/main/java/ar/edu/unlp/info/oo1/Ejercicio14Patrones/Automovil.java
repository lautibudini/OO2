package ar.edu.unlp.info.oo1.Ejercicio14Patrones;

import java.time.LocalDate;

public class Automovil extends Bien{

	private int modelo;
	private double kilometraje;
	private double costo0km;
	
	
	
	public Automovil( int modelo, double kilometraje, double costo0km) {
		//super(coeficienteLiquidez);
		super(0.7);
		this.modelo = modelo;
		this.kilometraje = kilometraje;
		this.costo0km = costo0km;
	}

	@Override
	public double getValor() {
		//Reduce 10% por cada año de antigüedad.
		
		return 0.1*(LocalDate.now().getYear() - this.modelo)*this.costo0km;
	}



}
