package Ejercicio4Refactoring;

public class SeisCuotas implements FormaDePago{

	@Override
	public double adicional(double valor) {
		
		return valor*0.2;
	}
	
	

}
