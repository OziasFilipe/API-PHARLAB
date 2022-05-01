package com.Apppharlab.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Apppharlab.api.model.UsuarioModel;
import com.Apppharlab.api.repository.UsuarioRepository;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuario;

	/**********                **********/
	/**********  Requisição GET **********/
	/**********                **********/
	
	@GetMapping(value = "buscarFormatoJson")
	public UsuarioModel BuscarFormato(UsuarioModel model) {
		return model;
	}
	
	
	@GetMapping(value =  "codigo/{codigo}")
	public UsuarioModel BuscarIdentificador(@PathVariable long codigo){
		return usuario.findById(codigo);
	}
 	
	@GetMapping(value = "nome")
	public List<UsuarioModel> BuscarNome(@RequestParam("nome") String nome) {
		return usuario.findByNome(nome);
	}
	
	
	@GetMapping(value = "situacao")
	public List<UsuarioModel> BuscarSituacao(@RequestParam("situacao") String situacao){
		return usuario.findBySituacao(situacao);
	}
	
	
	@GetMapping(value = "login")
	public List<UsuarioModel> BuscarLogin(@RequestParam("login")String login){
		return usuario.findByLogin(login);
	}
	
	@GetMapping(value = "senha")
	public List<UsuarioModel> BuscarSenha(@RequestParam("senha") String senha){
		return usuario.findBySenha(senha);
	}
	
	
	/**********                **********/
	/**********  Requisição POST **********/
	/**********                **********/
	
	@PostMapping("save")
	public UsuarioModel SalvarDados(@RequestBody UsuarioModel save) {
		return usuario.save(save);
	}
	
	/**********                **********/
	/**********  Requisição DELETE **********/
	/**********                **********/
	
	@PostMapping("deleteCodigo/{codigo}")
	public void  DeleteCodigo(@PathVariable long codigo) {
		 usuario.deleteById(codigo);
	}
	
	/**********                **********/
	/**********  Requisição PUT **********/
	/**********                **********/
	
	@PutMapping("atualizar")
	public UsuarioModel AtualizarDados(@RequestBody UsuarioModel atualzar) {
		return usuario.save(atualzar);
	}
	
}
