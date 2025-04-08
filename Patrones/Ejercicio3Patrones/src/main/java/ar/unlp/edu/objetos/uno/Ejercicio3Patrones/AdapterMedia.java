package ar.unlp.edu.objetos.uno.Ejercicio3Patrones;

public class AdapterMedia extends Media{
	
	private VideoStream vs;
	
	public AdapterMedia(VideoStream vs) { //Lo recibe como parametro ?
		this.vs = vs;
	}
	
	public String play() {
		return this.vs.reproduce();
	}
	

}
