package ar.unlp.edu.objetos.uno.Ejercicio10_patrones;

public class Mensajero {

	private TipoCifrado tipoCifrado;
	
	
	public Mensajero(TipoCifrado tipoCifrado) {
		this.tipoCifrado = tipoCifrado;
	}
	
	public void setTipoCifrado(TipoCifrado nuevo) {
		this.tipoCifrado = nuevo;
	}

	public void enviarMensaje(String mensaje) {
		String mensajeEncriptado = this.tipoCifrado.encriptar(mensaje);
		//Envia el mensaje.
	}
	
	public void recibirMensaje(String mensaje) {
		String mensajeOriginal = this.tipoCifrado.desencriptar(mensaje);
		//Hace lo que quiere con el mensaje original. 
	}
}
