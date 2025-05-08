package ar.edu.unlp.info.oo1.Ejercicio14Patrones;

public class Inmueble extends Bien {

	private String direccion; 
	private double superficie;
	private double costoM2;
	
	
	public Inmueble( String direccion, double superficie, double costoM2) {
		super(0.2);
		this.direccion = direccion;
		this.superficie = superficie;
		this.costoM2 = costoM2;
	}


	@Override
	public double getValor() {
		// Superficie * costo m2
		return this.superficie*this.costoM2;
	}

}
