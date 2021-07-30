package com.projetobiblioteca.biblioteca.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="professor")
@Getter @Setter
@PrimaryKeyJoinColumn(name="id_usuario")
public class Professor extends Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String departamento;
	
	public Professor(String nome, String cpf, String departamento) {
		super(nome, cpf);
		this.departamento = departamento;
	}
}
