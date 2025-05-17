package ar.edu.unlp.info.oo1.Ejercicio18Patrones;

public class TamañoDecorador extends FileDecorator{

	public TamañoDecorador(FileOO2 file) {
		super(file);
	}


	@Override
	public String getDecoradoAdicional() {
		return " - " + this.getTam();
	}
}
