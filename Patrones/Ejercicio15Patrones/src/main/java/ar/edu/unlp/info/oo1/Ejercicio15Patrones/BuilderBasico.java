package ar.edu.unlp.info.oo1.Ejercicio15Patrones;

public class BuilderBasico extends PCBuilder{

	@Override
	public void setProcesador() {
		this.getPc().setProcesador(Catalogo.getComponente("Procesador Basico"));
	}

	@Override
	public void setRAM() {
		this.getPc().setMemoriaRAM(Catalogo.getComponente("8 GB"));
	}

	@Override
	public void setDisco() {
		this.getPc().setDisco(Catalogo.getComponente("HDD 500 GB"));
	}

	@Override
	public void setTarjeta() {
		//No posee
	}

	@Override
	public void setGabinete() {
		this.getPc().setGabinete(Catalogo.getComponente("Gabinete Estándar"));
	}

	@Override
	public void setUsuario(String nombre) {
		this.getPc().setUsuario(nombre);
	}
	
	

}
