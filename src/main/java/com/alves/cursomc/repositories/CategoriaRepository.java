package com.alves.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alves.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer>{

	//void saveAll(List<Categoria> asList);

}