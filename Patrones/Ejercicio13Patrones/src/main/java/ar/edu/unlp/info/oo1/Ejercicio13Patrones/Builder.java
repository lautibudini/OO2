package ar.edu.unlp.info.oo1.Ejercicio13Patrones;

public abstract class Builder {

	private Sandwich sandwich;
	
	public void reset() {
		this.sandwich = new Sandwich();
	}
	
	public Sandwich getSandwich() {
		return this.sandwich;
	}
	// Abstract Methods
	
    public abstract void agregarPan();
    public abstract void agregarAderezo();
    public abstract void agregarPrincipal();
    public abstract void agregarAdicional();
}
