package com.exames.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exames.crud.model.UserModel;

@Repository
public interface UpdateRepository extends CrudRepository<UserModel, Long>{
}
