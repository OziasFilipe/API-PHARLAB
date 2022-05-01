package com.Apppharlab.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Apppharlab.api.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel,Long> {

	ProdutoModel findById(long id);
	
	@Query("FROM ProdutoModel WHERE advdescricao = ?1")
	List<ProdutoModel> findByDescricao(String descricao);
	
	@Query("FROM ProdutoModel WHERE advquantidade = ?1")
	List<ProdutoModel> findByQuantidade(int quantidade);
	
	@Query("FROM ProdutoModel WHERE advsituacao = ?1")
	List<ProdutoModel> findBySituacao(String situacao);
}
