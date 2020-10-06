package com.exames.crud.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class ExameModel {

	@Id
	@GeneratedValue
	private Long idExame;
	private String pedido;
	private String realizado;
	private String nomeExame;
	private String resultado;
	private String cpf;


	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Long getIdExame() {
		return idExame;
	}
	public void setIdExame(Long idExame) {
		this.idExame = idExame;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public String getRealizado() {
		return realizado;
	}
	public void setRealizado(String realizado) {
		this.realizado = realizado;
	}
	public String getNomeExame() {
		return nomeExame;
	}
	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
}
