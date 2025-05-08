package ar.edu.unlp.info.oo1.Ejercicio13Patrones;

public class Director {
	
	//Es mejor pasar el builder por parametro. 
	
	public void Build(Builder builder) {
		builder.reset();
		builder.agregarPan();
		builder.agregarPrincipal();
		builder.agregarAderezo();
		builder.agregarAdicional();
	}
	

}
