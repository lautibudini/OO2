package Ejercicio3Refactoring;

import java.util.List;

public class Document {
	
	
	
	
	// Dado el siguiente código implementado en la clase Document y que calcula algunas estadísticas del mismo:
	 List<String> words;
	  
	 public long characterCount() {
	        long count = this.words.stream().mapToLong(w -> w.length()).sum();
	    	return count;
		}
	    public long calculateAvg() {
	    	long avgLength = this.words.stream().mapToLong(w -> w.length()).sum() / this.words.size();
	        return avgLength;
		}
	// Resto del código que no importa
	
	    
	    



	/*
	Code Smells : 

	    Duplicated code : El segundo metodo repite codigo, es lo mismo del metodo de arriba. 
	    --> Deberia llamar el metodo de arriba y usar el resultado. 

	    Replace temp with query : Se usa una variable de mas, se podria retornar directo el resultado.
	    --> Sacar las variables y retornar directamente el resultado.

	    Variables publicas : Rompen el encap. 
	    --> Cambiar la lista a privada. (Encapsulate Field).

	    Cosas que no se podrian modificar en el refactoring : 
	    --> Long no es lo mismo que double . Es un entero muy grande. 
	    --> Lista vacia . 


	*/

	    
	    
	    
	    
	    

	// Codigo nuevo : 

	
	    private List<String> words;
	  
	    public long characterCount() {
	 	  return this.words.stream().mapToLong(w -> w.length()).sum();
	    
		}
	    public long calculateAvg() {
	    	return this.characterCount / this.words.size();
	           
		}
	// Resto del código que no importa
	




}
