package ar.edu.unlp.info.oo1.Ejercicio15Patrones;

public class BuilderIntermedio extends PCBuilder{

	public void setProcesador() {
		this.getPc().setProcesador(Catalogo.getComponente("Procesador Intermedio"));
	}

	@Override
	public void setRAM() {
		this.getPc().setMemoriaRAM(Catalogo.getComponente("16 GB"));
	}

	@Override
	public void setDisco() {
		this.getPc().setDisco(Catalogo.getComponente("SDD 500 GB"));
	}

	@Override
	public void setTarjeta() {
		this.getPc().setTarjetaGrafica(Catalogo.getComponente("GTX 1650"));
	}

	@Override
	public void setGabinete() {
		this.getPc().setGabinete(Catalogo.getComponente("Gabinete Intermedio"));
		this.getPc().add(Catalogo.getComponente("Fuente 800 W"));
	}

	@Override
	public void setUsuario(String nombre) {
		this.getPc().setUsuario(nombre);
	}
}
