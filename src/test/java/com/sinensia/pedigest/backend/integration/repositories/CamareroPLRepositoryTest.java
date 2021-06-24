package com.sinensia.pedigest.backend.integration.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

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
	}
	
	@Test
	public void should_retrieve_all_camarero() {
		System.err.println("**************************** TEST! ***************************************");
		List<CamareroPL> camareros = camareroPLRepository.findAll();
		
		assertEquals(2, camareros.size());	
	}
	
	
}
