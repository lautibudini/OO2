package io.github.unlp_oo.oo2_Ejercicio2_PiedraPapelTijera;

public interface Rol {
	
	public String jugada( Rol rol);
	public String juegaContraPapel();
	public String juegaContraPiedra();
	public String juegaContraTijera();
	
	//Agregado del punto 2.
	
	public String juegaContraLagarto();
	public String juegaContraSpock();
}
