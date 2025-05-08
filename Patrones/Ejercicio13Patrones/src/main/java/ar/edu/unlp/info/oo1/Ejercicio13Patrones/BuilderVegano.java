package ar.edu.unlp.info.oo1.Ejercicio13Patrones;

public class BuilderVegano extends Builder{

	@Override
	public void agregarPan() {
		this.getSandwich().setPan(new Ingrediente("Pan integral", 100));
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().setAderezo(new Ingrediente("Salsa criolla",20 ));
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().setPrincipal(new Ingrediente("Milanesa de girgolas",500 ));
	}

	@Override
	public void agregarAdicional() {
		this.getSandwich().setAdicional(new Ingrediente("Sin adicional",0));
	}

}
