package ar.edu.unlp.info.oo1.Ejercicio18Patrones;

import java.time.LocalDate;

public abstract class FileDecorator implements IFile {
	
	private IFile file;
	
	public FileDecorator(IFile file) {
		this.file = file; 
	}
	
	public String getExtension() {
		return this.file.getExtension();
	}
	public String getTam() {
		return this.file.getTam();
	}
	public LocalDate getFechaCreacion() {
		return this.file.getFechaCreacion();
	}
	public LocalDate getFechaModificacion() {
		return this.file.getFechaModificacion();
	}
	public String getPermisos() {
		return this.file.getPermisos();
	}
	
	
	public abstract String getDecoradoAdicional();
	
	public String prettyPrint() {
		//Hacemos uso de Template method. 
		return this.file.prettyPrint() + this.getDecoradoAdicional();
	}
	
	
	
}
