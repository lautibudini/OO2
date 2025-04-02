package Ejercicio2Refactoring;

public class UltimosPost {
	
	
	
	
	// Codigo original : 

	// Retorna los últimos N posts que no pertenecen al usuario user
	public List<Post> ultimosPosts(Usuario user, int cantidad) {
	        
	    List<Post> postsOtrosUsuarios = new ArrayList<Post>();
	    for (Post post : this.posts) {
	        if (!post.getUsuario().equals(user)) {
	            postsOtrosUsuarios.add(post);
	        }
	    }
	        
	   // ordena los posts por fecha
	   for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
	       int masNuevo = i;
	       for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
	           if (postsOtrosUsuarios.get(j).getFecha().isAfter(
	     postsOtrosUsuarios.get(masNuevo).getFecha())) {
	              masNuevo = j;
	           }    
	       }
	      Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
	      postsOtrosUsuarios.set(masNuevo, unPost);    
	   }
	        
	    List<Post> ultimosPosts = new ArrayList<Post>();
	    int index = 0;
	    Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
	    while (postIterator.hasNext() &&  index < cantidad) {
	        ultimosPosts.add(postIterator.next());
	    }
	    return ultimosPosts;
	}



	
	
	

	// (1)
	// Long method --> Es un metodo que hace demasiadas cosas por lo que es mejor 
	// separar sus funcionalidades y trabajar en cada una de ellas (Extract Method). 
	// Renombre el metodo para que se entienda mejor. 

	//(2)
	// Primer metodo de filtrado por usuario (Reinventar la rueda)  --> Lo trabaje con streams (Replace Loop with Pipeline).

	//(3)
	// Segundo metodo de filtrado por fecha (Reinventar la rueda)  --> Lo trabaje con streams (Replace Loop with Pipeline).

	//(4)
	// Al momento de truncar el stream con la cantidad maxima (Reinventar la rueda)  --> Lo trabaje con streams (Replace Loop with Pipeline).


	
	
	
	
	
	
	// Codigo nuevo : 

	public List<Post> ultimosNPostsSinElUsuario(Usuario user, int cantidad) {


	    List<Post> postsOtrosUsuarios = this.filtrarSinUsuario(user);
	        
	   // ordena los posts por fecha
	    this.postsOtrosUsuarios = this.ordenarPostPorFecha(this.postsOtrosUsuarios);
	   
	    //Trunca el stream 
	    return this.postsOtrosUsuarios.stream().limit(cantidad).colector(collect.toList());


	}

	public List<Post> filtrarSinElUsuario(Usuario user){
	     return this.posts.stream().filter(post --> post.getUsuario().notEquals(user).collect(colector.toList()))
	}

	public List<Post> ordenarPostPorFecha(List<Post> lista){
	    return this.lista.stream().sorted( (fecha1,fecha2) -> fecha1.getFecha().compareTo(fecha2.getFecha()) ).collect(colector.toList());
	}
	
	
	
	
	
	
	
	
	
	
	

}
