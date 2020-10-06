package com.exames.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exames.crud.model.UserModel;
import com.exames.crud.repository.UserRepository;

@RestController
public class UpdatePacientes {

	@Autowired
	private UserRepository userRepository;
	
	
	@PutMapping(value = "/inf/{idPaciente}")
	public ResponseEntity<UserModel> update(@PathVariable("idPaciente") Long id, @RequestBody UserModel userModel){
		return userRepository.findById(id)
				.map(record -> {
					record.setName(userModel.getName());
					record.setEmail(userModel.getEmail());
					record.setEndereco(userModel.getEndereco());
					record.setTelefone(userModel.getTelefone());
					record.setNascimento(userModel.getNascimento());
					UserModel updated = userRepository.save(record);
					return ResponseEntity.ok().body(updated);
				}).orElse(ResponseEntity.notFound().build());
	}
	
}
