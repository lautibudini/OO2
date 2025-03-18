package io.github.unlp_oo.oo2_Ejercicio2_PiedraPapelTijera;

public class Lagarto implements Rol{

	@Override
	public String jugada(Rol rol) {
		return rol.juegaContraLagarto();
	}

	@Override
	public String juegaContraPapel() {
		return "Gana Lagarto";
	}

	@Override
	public String juegaContraPiedra() {
		return "Gana Piedra";
	}

	@Override
	public String juegaContraTijera() {
		return "Gana Tijera";
	}

	@Override
	public String juegaContraLagarto() {
		return "Empate";
	}

	@Override
	public String juegaContraSpock() {
		return "Gana Lagarto";
	}
	

}
