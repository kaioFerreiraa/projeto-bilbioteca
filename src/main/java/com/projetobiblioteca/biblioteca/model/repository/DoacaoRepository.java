package com.projetobiblioteca.biblioteca.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobiblioteca.biblioteca.model.entities.Doacao;

public interface DoacaoRepository extends JpaRepository<Doacao, Long>{

}
