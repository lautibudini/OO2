package ar.edu.unlp.info.oo1.Ejercicio15Patrones;

public abstract class PCBuilder {

	private Presupuesto pc;
	
	public PCBuilder() {
		this.reset();
	}

	public void reset() {
		this.pc = new Presupuesto();
	}
	
	public Presupuesto getPc() {
		return this.pc;
	}
	
	public abstract void setProcesador();
	public abstract void setRAM();
	public abstract void setDisco();
	public abstract void setTarjeta();
	public abstract void setGabinete();
	public abstract void setUsuario(String nombre);
	
	
	
}
