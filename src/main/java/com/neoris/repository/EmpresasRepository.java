package com.neoris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neoris.entity.Empresa;

@Repository
public interface EmpresasRepository extends JpaRepository<Empresa, Long> {
	
}
