package com.Apppharlab.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class UsuarioModel {

	@Id
	@Column(name = "ADVCODUSUARIO")
	private Long id;
	
	@Column(name = "ADVSITUACAO")
	private String situacao;

	@Column(name = "ADVLOGIN")
	private String login;
	
	@Column(name = "ADVSENHA")
	private String senha;
	
	@Column(name = "ADVNOME")
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
