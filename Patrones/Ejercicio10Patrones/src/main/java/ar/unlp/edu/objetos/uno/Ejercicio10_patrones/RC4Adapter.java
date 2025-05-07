package ar.unlp.edu.objetos.uno.Ejercicio10_patrones;

public class RC4Adapter implements TipoCifrado{

	private RC4 tipo;
	private String key;
	
	public RC4Adapter(RC4 rc4, String key) {
		this.tipo = rc4;
		this.key = key;
	}
	

	// Necesita que la clave se proporcione cada vez que se realiza una operación de
	// cifrado o descifrado
	
	@Override
	public String encriptar(String mensaje) {
		return this.tipo.encriptar(mensaje, this.key);
	}

	@Override
	public String desencriptar(String mensaje) {
		return this.tipo.desencriptar(mensaje, this.key);
	}

}
