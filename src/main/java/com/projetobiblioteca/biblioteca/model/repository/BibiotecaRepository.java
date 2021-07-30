package com.projetobiblioteca.biblioteca.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobiblioteca.biblioteca.model.entities.Biblioteca;

public interface BibiotecaRepository extends JpaRepository<Biblioteca, Long> {

}
