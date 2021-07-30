package com.projetobiblioteca.biblioteca.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobiblioteca.biblioteca.model.entities.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
