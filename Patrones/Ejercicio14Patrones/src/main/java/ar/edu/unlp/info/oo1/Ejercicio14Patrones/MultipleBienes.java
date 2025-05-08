package ar.edu.unlp.info.oo1.Ejercicio14Patrones;

import java.util.List;

public class MultipleBienes extends Bien{
	
	private List<Bien> bienes; 
	
	
	public MultipleBienes(List<Bien> bienes) {
		super(0.5);
		this.bienes = bienes;
	}


	public void agregarBien(Bien nuevo) {
		this.bienes.add(nuevo);
	}

	//Metodo para remover bien. 

	@Override
	public double getValor() {
		//El valor de una prenda combinada es la sumatoria del valor 
		//de cada uno de los componentes 
		
		return this.bienes.stream().mapToDouble(e -> e.getValor()).sum();
	}

}
