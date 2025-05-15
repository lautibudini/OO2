package ar.edu.unlp.info.oo1.Ejercicio18Patrones;

public abstract class FileDecorator implements IFile {
	
	private FileOO2 file;
	
	public FileDecorator(FileOO2 file) {
		this.file = file; 
	}
	
	protected FileOO2 getFile() {
		return this.file;
	}
}
