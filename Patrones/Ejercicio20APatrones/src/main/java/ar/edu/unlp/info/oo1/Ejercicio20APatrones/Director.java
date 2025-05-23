package ar.edu.unlp.info.oo1.Ejercicio20APatrones;

public class Director {
	
	public Personaje construir(Builder builder){
		builder.reset();
		builder.setArma();
		builder.setArmadura();
		builder.setNombre();
		builder.setHabilidad();
		return builder.getPersonaje();
	}

}
