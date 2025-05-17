package ar.edu.unlp.info.oo1.Ejercicio18Patrones;

public class ExtensionDecorado extends FileDecorator{

	public ExtensionDecorado(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String getDecoradoAdicional() {
		return " - " + this.getExtension();
	}

	
}
