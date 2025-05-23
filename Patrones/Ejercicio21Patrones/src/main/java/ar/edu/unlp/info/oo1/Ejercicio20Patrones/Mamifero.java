package ar.edu.unlp.info.oo1.Ejercicio20Patrones;

import java.time.LocalDate;

public class Mamifero implements IMamifero{
	
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private IMamifero padre;
	private IMamifero madre;
	
	public Mamifero(String identificador, String especie, LocalDate fechaNacimiento, 
			IMamifero madre, IMamifero padre) {
		this.identificador = identificador;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
		this.madre = madre;
		this.padre = padre;
	}

	

	@Override
	public String getIdentificador() {
		return this.identificador;
	}

	@Override
	public String getEspecie() {
		return this.especie;
	}

	@Override
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	@Override
	public IMamifero getPadre() {
		return this.padre;
	}

	@Override
	public IMamifero getMadre() {
		return this.madre;
	}

	@Override
	public IMamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}

	@Override
	public IMamifero getAbuelaMaterna() {
		return this.getMadre().getMadre();
	}

	@Override
	public IMamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}

	@Override
	public IMamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}

	@Override
	public void setIdentificador(String id) {
		this.identificador = id; 
	}

	@Override
	public void setEspecie(String especie) {
		this.especie = especie; 
	}

	@Override
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha; 
	}

	@Override
	public void setPadre(IMamifero padre) {
		this.padre = padre; 
	}

	@Override
	public void setMadre(IMamifero madre) {
		this.madre = madre; 
	}

	@Override
	public Boolean tieneComoAncestroA(IMamifero unMamifero) {
		if (unMamifero.equals(this)) {
			return false; 
		}
		if ( this.padre.equals(unMamifero) || this.madre.equals(unMamifero) ) {
			return true;
		}
		return this.padre.tieneComoAncestroA(unMamifero) 
				|| this.madre.tieneComoAncestroA(unMamifero);
		
	}
	
	
	
	
	
	


}
