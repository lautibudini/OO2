package ar.edu.unlp.info.oo1.Ejercicio18Patrones;

public class CreacionDecorador extends FileDecorator{

	public CreacionDecorador(FileOO2 file) {
		super(file);
	}

	@Override
	public String getDecoradoAdicional() {
		return " - " + this.getFechaCreacion();
	}
	
	

}
