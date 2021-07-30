package com.projetobiblioteca.biblioteca.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobiblioteca.biblioteca.model.entities.Periodicos;

public interface PeriodicosRepository extends JpaRepository<Periodicos, Long> {

}
