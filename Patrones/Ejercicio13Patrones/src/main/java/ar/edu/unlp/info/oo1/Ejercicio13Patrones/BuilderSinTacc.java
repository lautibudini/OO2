package ar.edu.unlp.info.oo1.Ejercicio13Patrones;

public class BuilderSinTacc extends Builder{

	@Override
	public void agregarPan() {
		this.getSandwich().setPan(new Ingrediente("Chipa", 150));
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().setAderezo(new Ingrediente("Salsa tartara",18 ));
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().setPrincipal(new Ingrediente("Carne de pollo",250 ));
	}

	@Override
	public void agregarAdicional() {
		this.getSandwich().setAdicional(new Ingrediente("Verduras grilladas",200));
	}

}
