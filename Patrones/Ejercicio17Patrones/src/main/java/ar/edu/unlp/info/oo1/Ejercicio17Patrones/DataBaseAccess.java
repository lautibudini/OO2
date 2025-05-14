package ar.edu.unlp.info.oo1.Ejercicio17Patrones;

import java.util.Collection;
import java.util.List;

public interface DataBaseAccess {
	

	 public int insertNewRow(List<String> rowData);

	 public Collection<String> getSearchResults(String queryString); 
}
