package com.Apppharlab.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Apppharlab.api.model.PedidosModel;
import com.Apppharlab.api.repository.PedidosRepository;

@RequestMapping(value = "pedidos")
@RestController
public class PedidosController {
	
	@Autowired
	private PedidosRepository pedidos;
	
	/**********                **********/
	/**********  Requisição GET **********/
	/**********                **********/
	
	@GetMapping(value = "codprod")
	public List<PedidosModel> BuscarCodProd(@RequestParam(value = "codprod")int codprod){
		return pedidos.findByCodProd(codprod);
	}
	
	
	@GetMapping(value = "dataemissao")
	public List<PedidosModel>BuscarDataEmissao(@RequestParam(value = "dataemissao")String DataEmissao){
		return pedidos.findByEmissao(DataEmissao);
	}
	
	@GetMapping(value = "quantidade")
	public List<PedidosModel>BuscarquantItem(@RequestParam(value = "quantidade")int quantidade){
		return pedidos.findByQuantItem(quantidade);
	}
	
	@GetMapping(value = "valorTotal")
	public List<PedidosModel> BuscarValorTotal(@RequestParam(value = "valorTotal") int valorTotal){
		return pedidos.findByQuantItem(valorTotal);
	}
	
	
	/**********                **********/
	/**********  Requisição POST **********/
	/**********                **********/
	
	@PostMapping(value = "save")
	public PedidosModel SalvarDados(@RequestBody PedidosModel save){
		return pedidos.save(save);
	}

	/**********                **********/
	/**********  Requisição DELETE **********/
	/**********                **********/
	
	@DeleteMapping(value = "delete/{codigo}")
	public void DeletarDados(@PathVariable  long codigo) {
		 pedidos.deleteById(codigo);
	}
	
	/**********                **********/
	/**********  Requisição PUT **********/
	/**********                **********/
	
	@PutMapping(value = "save")
	public PedidosModel AtualizarDados(@RequestBody PedidosModel save){
		return pedidos.save(save);
	}
}
