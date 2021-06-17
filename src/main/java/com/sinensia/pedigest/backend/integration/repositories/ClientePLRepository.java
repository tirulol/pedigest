package com.sinensia.pedigest.backend.integration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.pedigest.backend.integration.model.ClientePL;

@Repository
public interface ClientePLRepository extends JpaRepository<ClientePL, Integer>{
	
	public List<ClientePL> findByActivo(boolean activo);
}
