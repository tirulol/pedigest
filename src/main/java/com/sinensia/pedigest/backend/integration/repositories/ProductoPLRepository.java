package com.sinensia.pedigest.backend.integration.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.pedigest.backend.integration.model.FamiliaPL;
import com.sinensia.pedigest.backend.integration.model.ProductoPL;

@Repository
public interface ProductoPLRepository extends JpaRepository<ProductoPL, Integer>{

	public List<ProductoPL> findByFamilia(FamiliaPL familia);
	public List<ProductoPL> findByPrecioBetween(double min, double max);
	public List<ProductoPL> findByFechaAltaBetween(Date desde, Date hasta);
	
}
