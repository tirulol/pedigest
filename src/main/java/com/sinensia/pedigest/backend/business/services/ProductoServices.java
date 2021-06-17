package com.sinensia.pedigest.backend.business.services;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.sinensia.pedigest.backend.business.model.Familia;
import com.sinensia.pedigest.backend.business.model.Producto;

public interface ProductoServices {

	/**
	 * El código NO es una buisiness key. Lo otorga el sistema
	 * 
	 */
	public Producto create(Producto producto);
	
	public Producto read(int codigo);
	
	public List<Producto> getAll();
	public List<Producto> getByFamilia(Familia familia);
	public List<Producto> getBetweenPrecios(double min, double max);
	public List<Producto> getBetweenFechaAlta(Date desde, Date hasta);
	
	/**
	 * ejemplo:
	 * 
	 * "BEBIDA" ->    120
	 * "CAFE" ->  	   89
	 * "POSTRES ->   1402
	 * 
	 */
	public Map<String, Integer> getEstadisticaCantidadPorFamilias();
	
	/**
	 * ejemplo:
	 * 
	 * "BEBIDA" ->    873.56
	 * "CAFE" ->  	  110.66
	 * "POSTRES ->     12.20
	 * 
	 */
	public Map<String, Double> getEstadisticaPreciomedioPorFamilias();
	
	/**
	 * El m�todo recibe una colecci�n de productos e incrementa sus precios seg�n porcentaje
	 * 
	 * ejemplo: Si un producto vale 100.00 � y el porcentaje es 10.0 (%) el precio queda en 110.00 � 
	 * 
	 */
	public void incrementarPrecio(Collection<Producto> productos, double porcentaje);
	
	/**
	 * Descataloga todos aquellos productos que se han dado de alta con una fecha anterior a la fecha dada
	 * 
	 */
	public int descatalogar(Date fechaLimite);
	
}
