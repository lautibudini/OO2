package ar.edu.unlp.info.oo1.Ejercicio18Patrones;

import java.time.LocalDate;

public interface IFile {
	
	public String getExtension();
	public String getTam();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
	public String prettyPrint();

}
