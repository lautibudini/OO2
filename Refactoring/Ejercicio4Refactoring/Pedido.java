package Ejercicio4Refactoring;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Pedido {
	
	private Cliente cliente;
	private List<Producto> productos;
	private FormaDePago formaPago;

	
	public Pedido (Cliente cliente, List<Producto> productos, FormaDePago formaPago) {
		this.cliente = cliente;
		this.productos = productos; 
		this.formaPago = formaPago;
	}
	
	public double getCostoTotal() {
		double costo = this.productos.stream()
				.mapToDouble(produc -> produc.getPrecio()).sum(); 
		costo = this.formaPago.adicional(costo);
		return this.descuentoPorAntiguedad(costo, this.añosDesdeAlta());	
	}
	
	
	
	private int añosDesdeAlta() {
		return Period.between(this.cliente.getFechaAlta(),
				LocalDate.now()).getYears();
	}
	
	private double descuentoPorAntiguedad(double valor, int antiguedad) {
		//Aplicar descuento del 10% si el cliente tiene más de 5 años de antiguedad
		if (antiguedad > 5) {
			return valor*0.9;
		}
		return valor;
	}
	
	
	
	
}

