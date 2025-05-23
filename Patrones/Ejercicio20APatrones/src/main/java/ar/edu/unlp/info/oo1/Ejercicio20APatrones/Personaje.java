package ar.edu.unlp.info.oo1.Ejercicio20APatrones;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
	
	private String nombre; 
	private Armadura armadura; 
	private Arma arma; 
	private List<String> habilidades; 
	private int puntosVida;
	
	public Personaje() {
		this.habilidades = new ArrayList<String>();
		this.puntosVida = 100; 
	}
	
	
	
	public void enfrentarse(Personaje oponente){
		if (this.estaVivo()) {
			if (oponente.estaVivo()) {
				this.restarVida(this.armadura.dañoDe(oponente.getArma())); 
				oponente.restarVida(oponente.getArmadura().dañoDe(this.arma));
			}
		}
	}
	
	
	
	public boolean estaVivo() {
		return this.puntosVida > 0;
	}
	
	public void restarVida(int puntos) {
		if ( (this.puntosVida - puntos) > 0){
			this.puntosVida -= puntos; 
		}else {
			this.puntosVida = 0; 
		}
	}


	public void addHabilidad(String nuevaHabilidad) {
		this.habilidades.add(nuevaHabilidad);
	}
	
	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}

}
