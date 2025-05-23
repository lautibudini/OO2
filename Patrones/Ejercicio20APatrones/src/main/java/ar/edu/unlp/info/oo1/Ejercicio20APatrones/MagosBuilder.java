package ar.edu.unlp.info.oo1.Ejercicio20APatrones;

public class MagosBuilder extends Builder {
	
	

	@Override
	public void setArma() {
		this.getPersonaje().setArma(new Baston());
	}

	@Override
	public void setArmadura() {
		this.getPersonaje().setArmadura(new Cuero());
	}

	@Override
	public void setNombre(String nombre) {
		this.getPersonaje().setNombre(nombre);
	}

	@Override
	public void setHabilidad() {
		this.getPersonaje().addHabilidad("Magia");
		this.getPersonaje().addHabilidad("Combate a distancia");
	}

}
