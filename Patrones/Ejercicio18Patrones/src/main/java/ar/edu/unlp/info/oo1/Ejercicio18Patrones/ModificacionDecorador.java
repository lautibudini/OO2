package ar.edu.unlp.info.oo1.Ejercicio18Patrones;

public class ModificacionDecorador extends FileDecorator{

	public ModificacionDecorador(FileOO2 file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return this.getFile().prettyPrint() + " - " + this.getFile().getFechaModificacion();
	}

}
