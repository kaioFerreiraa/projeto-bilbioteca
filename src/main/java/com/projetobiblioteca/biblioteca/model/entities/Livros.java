package com.projetobiblioteca.biblioteca.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="livros")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Inheritance(strategy=InheritanceType.JOINED)
public class Livros {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_livro")
	private Long id;
	
	private String titulo;
	
	private boolean catalogo;
	
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name="id_biblioteca")
	private Biblioteca biblioteca;
}
