package com.projetobiblioteca.biblioteca.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobiblioteca.biblioteca.model.entities.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{
	
}
