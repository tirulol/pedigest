package com.sinensia.pedigest.backend.business.services;

import java.util.List;

import com.sinensia.pedigest.backend.business.model.Camarero;

public interface CamareroServices {
	
	/**
	 * 
	 * El metodo crea un Camarero y devuelve el camarero con el id que
	 * le otorga el sistema.
	 * 
	 */
	public Camarero create(Camarero camarero);
	
	public Camarero read(int id);
	
	/**
	 * <h2>Actualiza en el sistema los datos del camarero</h2>
	 * 
	 * <p>Casos:</p>
	 * 
	 * <ol>
	 * 	<li>Si el id es null se lanza IllegalArgumentException</li>
	 *  <li>Si el id no existe se lanza IllegalArgumentException</li>
	 * </ol>
	 * 
	 */
	public void update(Camarero camarero);
	
	/**
	 * Elimina un camarero a través de su id.
	 * Si se puede eliminar devuelve true
	 * Si no se puede eliminar(id no existe) devuelve false
	 */
	public boolean delete(int id);
	
	public List<Camarero> getAll();
	
}
