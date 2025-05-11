package ar.edu.unlp.info.oo1.Ejercicio15Patrones;

public class Director {
	
	private PCBuilder builder;
	
	public Director(PCBuilder builder) {
		this.builder = builder;
	}
	
	public void setBuilder(PCBuilder builder) {
		this.builder = builder;
	}
	
	public Presupuesto build(String nombre) {
		this.builder.reset();
		this.builder.setProcesador();
		this.builder.setRAM();
		this.builder.setDisco();
		this.builder.setTarjeta();
		this.builder.setGabinete();
		this.builder.setUsuario(nombre);
		return this.builder.getPc();
	}

}
