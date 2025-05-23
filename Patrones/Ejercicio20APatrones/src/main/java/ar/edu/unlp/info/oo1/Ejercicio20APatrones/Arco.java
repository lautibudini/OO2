package ar.edu.unlp.info.oo1.Ejercicio20APatrones;

public class Arco extends Arma{
	
	@Override
	public int dañoContraCuero() {
		return 5;
	}

	@Override
	public int dañoContraHierro() {
		return 3;
	}

	@Override
	public int dañoContraAcero() {
		return 2;
	}

}
