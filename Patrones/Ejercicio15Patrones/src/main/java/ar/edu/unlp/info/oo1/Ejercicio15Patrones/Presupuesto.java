package ar.edu.unlp.info.oo1.Ejercicio15Patrones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	
	private List<Componente> componentes;
	private String nombre;
	private LocalDate fecha;
	
	
	public Presupuesto() {
		this.fecha = LocalDate.now();
		this.componentes = new ArrayList<Componente>();
	}
	
	public void add(Componente nuevo) {
		this.componentes.add(nuevo);
	}
	
	public void setProcesador(Componente com) {
		this.add(com);
	}
	
	public void setMemoriaRAM(Componente com) {
		this.add(com);
	}	
	public void setDisco(Componente com) {
		this.add(com);
	}
	
	public void setTarjetaGrafica(Componente com) {
		this.add(com);
	}
	public void setGabinete(Componente com) {
		this.add(com);
	}
	
	
	public double getConsumoTot() {
		return this.componentes.stream().
				mapToDouble(c -> c.getConsumo()).
				sum();
	}
	
	public double calcularPrecio() {
		return this.componentes.stream()
				.mapToDouble(comp -> comp.getPrecio())
				.sum();	
	}

	
	public void setUsuario(String nombre) {
		this.nombre = nombre;
	}
}
