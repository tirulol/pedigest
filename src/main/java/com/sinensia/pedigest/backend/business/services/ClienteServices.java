package com.sinensia.pedigest.backend.business.services;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.sinensia.pedigest.backend.business.model.Cliente;

public interface ClienteServices {

	/**
	 * 
	 * El metodo crea un Cliente y devuelve el cliente con el codigo que
	 * le otorga el sistema.
	 * 
	 */
	public Cliente create(Cliente cliente);
	
	public Cliente read(int codigo);
	
	/**
	 * <h2>Actualiza en el sistema los datos del cliente</h2>
	 * 
	 * <p>Casos:</p>
	 * 
	 * <ol>
	 * 	<li>Si el c�digo es null se lanza IllegalArgumentException</li>
	 *  <li>Si el c�digo no existe se lanza IllegalArgumentException</li>
	 * </ol>
	 * 
	 */
	public void update(Cliente cliente);
	
	/**
	 * Elimina un cliente a trav�s de su c�digo.
	 * Si se puede eliminar devuelve true
	 * Si no se puede eliminar(codigo no existe) devuelve false
	 */
	public boolean delete(int codigo);
	
	public List<Cliente> getAll();
	
	public List<Cliente> getActivos();
	
	public List<Cliente> getBetweenCredito(double min, double max);
	public List<Cliente> getBetweenFechas(Date desde, Date hasta);
	
	/**
	 * Devuelve un mapa con la cantidad de clientes activos y no activos
	 * 
	 * ejemplo;
	 * 
	 * 	true -----> 2566   // activos 
	 *	false ---->   57   // no activos
	 * 
	 */
	public Map<Boolean,Integer> getEstadisticaCantidadByActivo();
	
	

	
}
