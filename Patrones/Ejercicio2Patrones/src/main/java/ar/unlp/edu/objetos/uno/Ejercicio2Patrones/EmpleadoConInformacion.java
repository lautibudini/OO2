package ar.unlp.edu.objetos.uno.Ejercicio2Patrones;

public abstract class EmpleadoConInformacion extends Empleado{

	
	private int cantHijos;
	private boolean casado;
	
	
	public EmpleadoConInformacion(int cantHijos, boolean casado) {
		this.cantHijos = cantHijos;
		this.casado = casado;
	}

	
	@Override
	public double getAdicional() {
		if (this.casado) {
			return 5000 + (this.cantHijos * 2000);
		}
		return this.cantHijos * 2000;
	}

	@Override
	public abstract double getBasico();

}
