package io.github.unlp_oo.oo2_Ejercicio2_PiedraPapelTijera;

public class Spock implements Rol{

	@Override
	public String jugada(Rol rol) {
		return rol.juegaContraSpock();
	}

	@Override
	public String juegaContraPapel() {
		return "Gana Papel";
	}

	@Override
	public String juegaContraPiedra() {
		return "Gana Spock";
	}

	@Override
	public String juegaContraTijera() {
		return "Gana Spock";
	}

	@Override
	public String juegaContraLagarto() {
		return "Gana Lagarto";
	}

	@Override
	public String juegaContraSpock() {
		return "Empate";
	}
	
	

}
