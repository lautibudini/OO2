package ar.edu.unlp.info.oo1.Ejercicio18Patrones;

public class TamañoDecorador extends FileDecorator{

	public TamañoDecorador(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return this.getFile().prettyPrint() + " - " + this.getFile().getTam();
	}
}
