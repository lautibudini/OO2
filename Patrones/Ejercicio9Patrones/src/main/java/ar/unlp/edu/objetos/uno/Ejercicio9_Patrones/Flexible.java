package ar.unlp.edu.objetos.uno.Ejercicio9_Patrones;

public class Flexible implements Politica{

	@Override
	public double getReembolso(double monto, int cantDias) {
		// se reembolsará el monto total sin importar la fecha de cancelación
		return monto;
	}

	
	
}
