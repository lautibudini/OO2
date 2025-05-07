package ar.unlp.edu.objetos.uno.Ejercicio9_Patrones;

public class Moderada implements Politica{

	@Override
	public double getReembolso(double monto, int cantDias) {
		// se reembolsará el monto total si la cancelación se hace hasta una semana antes
		// y 50% si se hace hasta 2 días antes.

		if (cantDias >= 7) {
			return monto;
		}else if (cantDias >= 2) {
			return monto*0.5;
		}
		return 0; 
	}

}
