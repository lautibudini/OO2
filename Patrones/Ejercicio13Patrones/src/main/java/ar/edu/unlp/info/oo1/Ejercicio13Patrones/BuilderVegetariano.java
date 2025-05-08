package ar.edu.unlp.info.oo1.Ejercicio13Patrones;

public class BuilderVegetariano extends Builder {

	@Override
	public void agregarPan() {
		this.getSandwich().setPan(new Ingrediente("Pan con semillas", 120));
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().setAderezo(new Ingrediente("sin aderezo", 0));
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().setPrincipal(new Ingrediente("Provoleta grillada", 200));
	}

	@Override
	public void agregarAdicional() {
		this.getSandwich().setAdicional(new Ingrediente("berenjena",100));
	}

}
