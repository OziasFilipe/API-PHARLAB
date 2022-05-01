package com.Apppharlab.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Apppharlab.api.model.PedidosModel;

@Repository
public interface PedidosRepository extends JpaRepository<PedidosModel,Long>{

	PedidosModel findById(long id);
	
	@Query("FROM PedidosModel WHERE advcodprod = ?1")
	List<PedidosModel> findByCodProd(int codprod);
	
	@Query("FROM PedidosModel WHERE advemissao = ?1")
	List<PedidosModel> findByEmissao(String emissao);
	
	@Query("FROM PedidosModel WHERE advquantitem = ?1")
	List<PedidosModel> findByQuantItem(int item);
	
	@Query("FROM PedidosModel WHERE advalortotal = ?1")
	List<PedidosModel> findByValorTotal(int total);
}
