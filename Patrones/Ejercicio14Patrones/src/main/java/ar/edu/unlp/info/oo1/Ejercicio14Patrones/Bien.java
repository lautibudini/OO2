package ar.edu.unlp.info.oo1.Ejercicio14Patrones;

public abstract class Bien {
	
	private double coeficienteLiquidez;
	
	
	public Bien(double coeficienteLiquidez) {
		this.coeficienteLiquidez = coeficienteLiquidez;
	}
	
	public abstract double getValor();
	
	public double getValorPrendario() {
		return this.getValor()*this.coeficienteLiquidez;
	}

}
