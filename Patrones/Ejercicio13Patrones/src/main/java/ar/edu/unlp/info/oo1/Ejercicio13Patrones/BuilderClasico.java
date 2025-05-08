package ar.edu.unlp.info.oo1.Ejercicio13Patrones;

public class BuilderClasico extends Builder {

	@Override
	public void agregarPan() {
		this.getSandwich().setPan(new Ingrediente("Pan Brioce", 100));
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().setAderezo(new Ingrediente("Mayonesa", 20));
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().setPrincipal(new Ingrediente("Carne Ternera", 300));
	}

	@Override
	public void agregarAdicional() {
		this.getSandwich().setAdicional(new Ingrediente("Tomate",80));
	}

}
