package com.exames.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserModel {
	@Id
	@GeneratedValue
	private Long idPaciente;
	
	
	private String name;
	private String email;
	private String endereco;
	private String telefone;
	private String nascimento;
	private String cpf;

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}




	

	public UserModel() {
		super();
	}

	public UserModel(Long idPaciente, String name, String email, String endereco, String nascimento, String telefone, String cpf) {
		super();
		this.idPaciente = idPaciente;
		this.name = name;
		this.email = email;
		this.endereco = endereco;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}


	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
}
