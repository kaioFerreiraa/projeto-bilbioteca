package com.projetobiblioteca.biblioteca.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="estudante")
@Getter @Setter
@PrimaryKeyJoinColumn(name="id_usuario")
public class Estudante extends Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String curso;

	public Estudante(String nome, String cpf, String curso) {
		super(nome, cpf);
		this.curso = curso;
	}
	
	

}
