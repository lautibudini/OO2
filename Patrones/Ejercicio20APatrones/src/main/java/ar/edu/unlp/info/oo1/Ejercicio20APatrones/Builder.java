package ar.edu.unlp.info.oo1.Ejercicio20APatrones;

public abstract class Builder {
	
	private Personaje personaje;
	
	public void reset() {
		this.personaje = new Personaje();
	}
	
	public Personaje getPersonaje() {
		return this.personaje;
	}
	
	public abstract void setArma();
	public abstract void setArmadura();
	public abstract void setNombre();
	public abstract void setHabilidad();
}
