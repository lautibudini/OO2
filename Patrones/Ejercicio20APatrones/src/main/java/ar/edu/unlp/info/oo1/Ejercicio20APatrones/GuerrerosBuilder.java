package ar.edu.unlp.info.oo1.Ejercicio20APatrones;

public class GuerrerosBuilder extends Builder{

	
	
	@Override
	public void setArma() {
		this.getPersonaje().setArma(new Espada());
	}

	@Override
	public void setArmadura() {
		this.getPersonaje().setArmadura(new Acero());;
	}

	@Override
	public void setNombre(String nombre) {
		this.getPersonaje().setNombre(nombre);;
	}

	@Override
	public void setHabilidad() {
		// nada
	}
	
	

}
