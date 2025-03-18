package io.github.unlp_oo.oo2_Ejercicio2_PiedraPapelTijera;

public class Papel implements Rol {

	@Override
	public String jugada(Rol rol) {
		return rol.juegaContraPapel();
	}

	@Override
	public String juegaContraPapel() {
		return "Empate";
	}

	@Override
	public String juegaContraPiedra() {
		return "Gana Papel";
	}

	@Override
	public String juegaContraTijera() {
		return "Gana Tijera";
	}

	//Agregado del punto 2.
	
	@Override
	public String juegaContraLagarto() {
		return "Gana Lagarto";
	}

	@Override
	public String juegaContraSpock() {
		return "Gana Papel";
	}
	
	

}
