package ar.edu.unlp.info.oo1.Ejercicio13Patrones;


public class Sandwich {
	
	private Ingrediente pan;
	private Ingrediente principal;
	private Ingrediente aderezo;
	private Ingrediente adicional;
	
	
	public Ingrediente getPan() {
        return pan;
    }

    public void setPan(Ingrediente pan) {
        this.pan = pan;
    }

    public Ingrediente getAderezo() {
        return aderezo;
    }

    public void setAderezo(Ingrediente aderezo) {
        this.aderezo = aderezo;
    }

    public Ingrediente getPrincipal() {
        return principal;
    }

    public void setPrincipal(Ingrediente principal) {
        this.principal = principal;
    }

    public Ingrediente getAdicional() {
        return adicional;
    }

    public void setAdicional(Ingrediente adicional) {
        this.adicional = adicional;
    }
	
    public double getPrecio(){
        return this.pan.getPrecio() + this.aderezo.getPrecio() + this.principal.getPrecio() + this.adicional.getPrecio();
    }

	 

}
