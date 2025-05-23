package ar.edu.unlp.info.oo1.Ejercicio20Patrones;

import java.time.LocalDate;

public class MamiferoNull implements IMamifero {

	@Override
	public String getIdentificador() {
		return null;
	}

	@Override
	public String getEspecie() {
		return null;
	}

	@Override
	public LocalDate getFechaNacimiento() {
		return null; 
	}

	@Override
	public IMamifero getPadre() {
		return null; 
	}

	@Override
	public IMamifero getMadre() {
		return null; 
	}

	@Override
	public IMamifero getAbueloMaterno() {
		return null; 
	}

	@Override
	public IMamifero getAbuelaMaterna() {
		return null; 
	}

	@Override
	public IMamifero getAbueloPaterno() {
		return this; 
	}

	@Override
	public IMamifero getAbuelaPaterna() {
		return null; 
	}

	@Override
	public void setIdentificador(String id) {

	}

	@Override
	public void setEspecie(String especie) {
		
	}

	@Override
	public void setFechaNacimiento(LocalDate fecha) {
		
	}

	@Override
	public void setPadre(IMamifero padre) {
		
	}

	@Override
	public void setMadre(IMamifero madre) {
		
	}

	@Override
	public Boolean tieneComoAncestroA(IMamifero unMamifero) {
		return false; 
	}

}
