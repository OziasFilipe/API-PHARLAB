package com.Apppharlab.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOS")
public class PedidosModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADVCODPEDIDO")
	private Long codigoPedido;
	
	@Column(name = "ADVEMISSAO")
	private String dataEmissao;
	
	@Column(name = "ADVALORTOTAL")
	private int valorTotal;
	
	@Column(name = "ADVQUANTITEM")
	private int quantidadeItem; 
	
	@Column(name = "ADVCODPROD")
	private int codigoProduto;

	public Long getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(Long codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getQuantidadeItem() {
		return quantidadeItem;
	}

	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	
	
	
	
}
