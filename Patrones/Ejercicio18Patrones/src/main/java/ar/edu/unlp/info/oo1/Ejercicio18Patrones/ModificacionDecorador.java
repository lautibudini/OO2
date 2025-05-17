package ar.edu.unlp.info.oo1.Ejercicio18Patrones;

public class ModificacionDecorador extends FileDecorator{

	public ModificacionDecorador(IFile file) {
		super(file);
	}


	@Override
	public String getDecoradoAdicional() {
		return "- " + this.getFechaModificacion();
	}

}
