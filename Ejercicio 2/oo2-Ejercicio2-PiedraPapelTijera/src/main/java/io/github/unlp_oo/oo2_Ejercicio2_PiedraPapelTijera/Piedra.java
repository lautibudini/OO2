package io.github.unlp_oo.oo2_Ejercicio2_PiedraPapelTijera;

public class Piedra implements Rol {
	
	public String juegaContraPiedra() {
		return "Empate";
	}
	
	public String juegaContraPapel() {
		return "Gana papel";
	}
	
	public String juegaContraTijera() {
		return "Gana Piedra";
	}

	public String jugada(Rol rol) {
		return rol.juegaContraPiedra();
	}

	// Agregado del punto dos. 
	
	@Override
	public String juegaContraLagarto() {
		return "Gana Piedra";
	}

	@Override
	public String juegaContraSpock() {
		return "Gana Spock";
	}
}
