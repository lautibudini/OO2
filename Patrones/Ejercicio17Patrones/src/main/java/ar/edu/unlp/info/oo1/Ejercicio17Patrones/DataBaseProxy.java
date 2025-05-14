package ar.edu.unlp.info.oo1.Ejercicio17Patrones;

import java.util.Collection;
import java.util.List;

public class DataBaseProxy implements DataBaseAccess{

	private String key;
	private DataBaseRealAccess realAcces;
	private boolean logeado;
	
	
	
	public DataBaseProxy(DataBaseRealAccess realAcces, String key) {
		this.realAcces =  realAcces;
		this.key = key;
		this.logeado = false;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.logeado) {
			return this.realAcces.insertNewRow(rowData);
		}else {
			throw new RuntimeException("Primero debes logearte.");
		}
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.logeado) {
			return this.realAcces.getSearchResults(queryString);
		}else {
			throw new RuntimeException("Primero debes logearte.");
		}
	}
	
	
	public void logIn(String password){
		if (!this.logeado) {
			if (this.key.equals(password)) {
				this.logeado = true;
			}else {
				throw new RuntimeException("Contraseña incorrecta.");
			}
		}else {
			throw new RuntimeException("Ya estas logeado.");
		}
	}
	
	
	public void logOut() {
		if (this.logeado) {
			this.logeado = false;
		}else {
			throw new RuntimeException("No estas logeado, primero debes hacerlo.");
		}
	}
	
	
	

	
	
}
