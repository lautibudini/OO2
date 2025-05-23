package ar.edu.unlp.info.oo1.Ejercicio20APatrones;

public class Director {
	
	public Personaje construir(Builder builder, String nombre){
		builder.reset();
		builder.setArma();
		builder.setArmadura();
		builder.setNombre(nombre);
		builder.setHabilidad();
		return builder.getPersonaje();
	}

}
