package com.sinensia.pedigest.backend.integration.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.sinensia.pedigest.backend.integration.model.CamareroPL;

@DataJpaTest
public class CamareroPLRepositoryTest {

	@Autowired
	private CamareroPLRepository camareroPLRepository;
	
	@Test
	public void should_store_a_camarero() {
		
		CamareroPL camareroPL = new CamareroPL();
		camareroPL.setNombre("Carlota Cifuentes");
		
		CamareroPL createdCamareroPL = camareroPLRepository.save(camareroPL);
		
		assertEquals("Carlota Cifuentes", createdCamareroPL.getNombre());
		assertNotEquals(0, createdCamareroPL.getId());
	}
	
	@Test
	public void should_retrieve_all_camarero() {
		
		List<CamareroPL> camareros = camareroPLRepository.findAll();
		
		assertEquals(2, camareros.size());	
	}
	
	@Test
	public void should_return_total_camareros_count() {
		
		long numeroTotalCamareros = camareroPLRepository.count();
		
		assertEquals(3, numeroTotalCamareros);	
	}
	
	@Test
	public void should_return_camarero_by_id() {
		
		Optional<CamareroPL> optional = camareroPLRepository.findById(101);
		
		assertTrue(optional.isPresent());
		CamareroPL camareroPL = optional.get();
		assertEquals("Honorio Martín Salvador H2", camareroPL.getNombre());
		
	}
	
	
}
