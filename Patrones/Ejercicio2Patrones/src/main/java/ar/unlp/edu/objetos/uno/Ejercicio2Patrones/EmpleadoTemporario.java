package ar.unlp.edu.objetos.uno.Ejercicio2Patrones;

public class EmpleadoTemporario extends EmpleadoConInformacion {
	
	
	private int cantHoras;
	
	
	
	public EmpleadoTemporario(int cantHijos, boolean casado, int cantHoras) {
		super(cantHijos, casado);
		this.cantHoras = cantHoras;
	}
	
	@Override
	public double getBasico() {
		return 20000 + (this.cantHoras*300);
	}
	
	
	

}
