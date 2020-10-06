package com.exames.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exames.crud.model.ExameModel;

@Repository
public interface ExameReposity extends JpaRepository<ExameModel, Long> {

}
