package ar.edu.unlp.info.oo1.Ejercicio20APatrones;

public class Baston extends Arma{
	
	@Override
	public int dañoContraCuero() {
		return 2;
	}

	@Override
	public int dañoContraHierro() {
		return 1;
	}

	@Override
	public int dañoContraAcero() {
		return 1;
	}

}
