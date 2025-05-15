package ar.edu.unlp.info.oo1.Ejercicio18Patrones;

public class PermisosDecorado extends FileDecorator {

	
	
	public PermisosDecorado(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return this.getFile().prettyPrint() + " - " + this.getFile().getPermisos();
	}

}
