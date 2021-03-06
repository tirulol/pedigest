package com.sinensia.pedigest.backend.integration.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sinensia.pedigest.backend.integration.model.CamareroPL;
import com.sinensia.pedigest.backend.integration.model.LineaPedidoPL;
import com.sinensia.pedigest.backend.integration.model.PedidoPL;

@Repository
public interface PedidoPLRepository extends JpaRepository<PedidoPL, Integer>{

	public List<PedidoPL> findByFechaHoraBetween(Date desde, Date hasta);
	
	public List<PedidoPL> findByCamarero(CamareroPL camarero);

	public List<PedidoPL> findByCamareroId(int codigo);
	
	@Query ("SELECT lp FROM PedidoPL p JOIN p.lineas lp WHERE p.codigo = :codigoPedido")
	public List<LineaPedidoPL> findLineas(@Param("codigoPedido") int codigoPedido);
	
}
