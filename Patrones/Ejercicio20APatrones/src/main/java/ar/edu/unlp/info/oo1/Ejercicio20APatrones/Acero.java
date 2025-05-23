package ar.edu.unlp.info.oo1.Ejercicio20APatrones;

public class Acero extends Armadura{

	@Override
	public int dañoDe(Arma arma) {
		return arma.dañoContraAcero();
	}
	
	

}
