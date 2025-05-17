package ar.edu.unlp.info.oo1.Ejercicio18Patrones;

public class PermisosDecorado extends FileDecorator {

	
	
	public PermisosDecorado(FileOO2 file) {
		super(file);
	}

	@Override
	public String getDecoradoAdicional() {
		return " - " + this.getPermisos();
	}

}
