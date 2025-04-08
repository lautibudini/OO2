package ar.unlp.edu.objetos.uno.Ejercicio2Patrones;

public class EmpleadoPasante extends Empleado{
	
	private int examenesRendidos;
	
	public EmpleadoPasante(int examenes) {
		this.examenesRendidos = examenes; 
	}

	@Override
	public double getAdicional() {
		return this.examenesRendidos * 200;
	}

	@Override
	public double getBasico() {
		return 20000;
	}
	
	

}
