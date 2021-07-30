package com.projetobiblioteca.biblioteca.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobiblioteca.biblioteca.model.entities.InfoEmprestimo;

public interface InfoEmprestimoRepository extends JpaRepository<InfoEmprestimo, Long> {

}
