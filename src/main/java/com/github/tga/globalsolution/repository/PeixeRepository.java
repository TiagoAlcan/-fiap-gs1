package com.github.tga.globalsolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.tga.globalsolution.model.Peixe;

@Repository
public interface PeixeRepository extends JpaRepository<Peixe, Long>{

}
