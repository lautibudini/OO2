package ar.edu.unlp.info.oo1.Ejercicio14Patrones;

import java.time.LocalDate;

public class Alquiler extends Bien{

	private LocalDate comienzoContrato;
	private LocalDate finContrato;
	private double costoMensual;
	
	

	public Alquiler( LocalDate comienzoContrato, LocalDate finContrato,double costoMensual) {
		super(0.9);
		this.comienzoContrato = comienzoContrato;
		this.finContrato = finContrato;
		this.costoMensual = costoMensual;
	}


	@Override
	public double getValor() {
		// Meses que faltan del contrato * costo mensual
		
		int aniosFaltantes = (this.finContrato.getYear() - LocalDate.now().getYear()) * 12;
        int mesesFaltantes = this.finContrato.getMonthValue() - LocalDate.now().getMonthValue();

        return (aniosFaltantes + mesesFaltantes) * this.costoMensual;
	}

}
