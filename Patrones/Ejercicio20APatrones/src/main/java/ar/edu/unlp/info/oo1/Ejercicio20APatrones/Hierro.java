package ar.edu.unlp.info.oo1.Ejercicio20APatrones;

public class Hierro extends Armadura{

	@Override
	public int dañoDe(Arma arma) {
		return arma.dañoContraHierro();
	}
	
	

}
