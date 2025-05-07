package ar.unlp.edu.objetos.uno.Ejercicio10_patrones;

public class FeiselAdapter implements TipoCifrado{

	private FeistelCipher tipo;
	private String key;
	
	// Requiere una clave en el momento de la creación del objeto
	// Utiliza esa clave internamente para cifrar y descifrar mensajes.
	
	public FeiselAdapter( String key){
		this.key = key;
		this.tipo = new FeistelCipher(key);
	}
	
	// Este algoritmo utiliza encode para cifrar y el mismo mensaje para descifrar

	
	@Override
	public String encriptar(String mensaje) {
		return this.tipo.encode(mensaje);
	}

	@Override
	public String desencriptar(String mensaje) {
		return this.tipo.encode(mensaje);
	}

	

	
	
}
