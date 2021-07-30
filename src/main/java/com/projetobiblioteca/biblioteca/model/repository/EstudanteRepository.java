package com.projetobiblioteca.biblioteca.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobiblioteca.biblioteca.model.entities.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

}
