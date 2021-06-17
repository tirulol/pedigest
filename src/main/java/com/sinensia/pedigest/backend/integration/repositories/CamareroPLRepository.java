package com.sinensia.pedigest.backend.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.pedigest.backend.integration.model.CamareroPL;

@Repository
public interface CamareroPLRepository extends JpaRepository<CamareroPL, Integer>{

}
