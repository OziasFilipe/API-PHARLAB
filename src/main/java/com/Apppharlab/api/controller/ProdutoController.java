package com.Apppharlab.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Apppharlab.api.model.ProdutoModel;
import com.Apppharlab.api.repository.ProdutoRepository;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produto;
	
	/**********                **********/
	/**********  Requisição GET **********/
	/**********                **********/
	
	@GetMapping(value = "buscarFormatoJson")
	public ProdutoModel BuscarFormato(ProdutoModel model) {
		return model;
	}
	
	@GetMapping(value = "codigo/{codigo}")
	public ProdutoModel BuscarCodigo(@PathVariable long codigo) {
		return produto.findById(codigo);
	}
	
	@GetMapping(value = "descricao")
	public List<ProdutoModel> BuscarDescricao(@RequestParam (value = "descricao")String descricao) {
		return produto.findByDescricao(descricao);
	}
		
	@GetMapping(value = "quantidade")
	public List<ProdutoModel> BuscarQuantidade(@RequestParam(value = "quantidade")int quantidade){
		return produto.findByQuantidade(quantidade);
	}
	
	@GetMapping(value = "situacao")
	public List<ProdutoModel> BuscarSituacao(@RequestParam(value = "situacao")String situacao){
		return produto.findBySituacao(situacao);
	}
	
	/**********                **********/
	/**********  Requisição POST **********/
	/**********                **********/
	
	@PostMapping(value = "save")
	public ProdutoModel SalvarDados(@RequestBody ProdutoModel salvar) {
		return produto.save(salvar);
	}
	/**********                **********/
	/**********  Requisição DELETE **********/
	/**********                **********/
	@DeleteMapping(value = "delete/{codigo}")
	public void DeletarDados(@PathVariable  long codigo) {
		 produto.deleteById(codigo);
	}
	/**********                **********/
	/**********  Requisição POST **********/
	/**********                **********/
	
	@PostMapping(value = "atualizarDados")
	public ProdutoModel AtualizarDados(@RequestBody ProdutoModel atualizar) {
		return produto.save(atualizar);
	}
}
