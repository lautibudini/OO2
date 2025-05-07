package ar.unlp.edu.objetos.uno.Ejercicio9_Patrones;

public class AutoEnAlquiler {
	
	private double precioPorDia;
	private int cantidadPlazas;
	private String marca; 
	private Politica politicaReembolso;
	
	public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, 
			String marca, Politica politicaReembolso) {
		this.precioPorDia = precioPorDia;
		this.cantidadPlazas = cantidadPlazas;
		this.marca = marca;
		this.politicaReembolso = politicaReembolso;
	} 
	
	public double getPrecioPorDia() {
		return this.precioPorDia;
	}
	
	public double calcularReembolso(double monto, int cantDias) {
		return this.politicaReembolso.getReembolso(monto, cantDias);
	}
	
	public void setPoliticaReembolso (Politica nueva) {
		this.politicaReembolso = nueva; 
	}

}
