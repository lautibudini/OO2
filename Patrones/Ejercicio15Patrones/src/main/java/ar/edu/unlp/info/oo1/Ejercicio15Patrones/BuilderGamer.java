package ar.edu.unlp.info.oo1.Ejercicio15Patrones;

public class BuilderGamer extends PCBuilder {
	
	public void setProcesador() {
		this.getPc().setProcesador(Catalogo.getComponente("Procesador Gamer"));
		this.getPc().add(Catalogo.getComponente("Pad térmico"));
		this.getPc().add(Catalogo.getComponente("Cooler"));
	}

	@Override
	public void setRAM() {
		this.getPc().setMemoriaRAM(Catalogo.getComponente("32 GB"));
		this.getPc().setMemoriaRAM(Catalogo.getComponente("32 GB"));
	}

	@Override
	public void setDisco() {
		this.getPc().setDisco(Catalogo.getComponente("SSD 500gb"));
		this.getPc().setDisco(Catalogo.getComponente("SSD 1TB"));
	}

	@Override
	public void setTarjeta() {
		this.getPc().setTarjetaGrafica(Catalogo.getComponente("RTX 4090"));
	}
	
	public void setGabinete() {
		this.getPc().setGabinete(Catalogo.getComponente("Gabinete gamer"));
		double consumo = this.getPc().getConsumoTot();
		String fuente = "fuente " + (consumo + consumo * 0.5) + " w";
		this.getPc().add(Catalogo.getComponente(fuente));
	}
	
	@Override
	public void setUsuario(String nombre) {
		this.getPc().setUsuario(nombre);
	}


}
