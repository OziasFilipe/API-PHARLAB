package com.Apppharlab.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.Apppharlab.api.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long> {

	UsuarioModel findById (long id);
	
	@Query("FROM UsuarioModel WHERE advnome = ?1")
	List<UsuarioModel> findByNome(String nome);

	@Query("FROM UsuarioModel WHERE advsituacao = ?1")
	List<UsuarioModel> findBySituacao(String situacao);
	
	@Query("FROM UsuarioModel WHERE advlogin = ?1")
	List<UsuarioModel> findByLogin(String login);
	
	@Query("FROM UsuarioModel WHERE advsenha = ?1 ")
	List<UsuarioModel>findBySenha(String senha);	
}
