package io.github.unlp_oo.oo2_Ejercicio2_PiedraPapelTijera;

public class Tijera implements Rol{

	@Override
	public String jugada(Rol rol) {
		return rol.juegaContraTijera();
	}

	@Override
	public String juegaContraPapel() {
		return "Gana Tijera";
	}

	@Override
	public String juegaContraPiedra() {
		return "Gana Piedra";
	}

	@Override
	public String juegaContraTijera() {
		return "Empate";
	}

	//Agregado del punto 2.
	
	@Override
	public String juegaContraLagarto() {
		return "Gana Tijera";
	}

	@Override
	public String juegaContraSpock() {
		return "Gana Spock";
	}
	
	

}
