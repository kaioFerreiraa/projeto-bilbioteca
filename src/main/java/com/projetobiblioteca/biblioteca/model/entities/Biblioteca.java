package com.projetobiblioteca.biblioteca.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="biblioteca")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Biblioteca implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@OneToMany(mappedBy="biblioteca", fetch=FetchType.LAZY)
	private List<Usuario> usuarios;
	
	@OneToMany(mappedBy="biblioteca", fetch=FetchType.LAZY)
	private List<Livros> livros;
	
	@OneToMany(mappedBy="biblioteca", fetch=FetchType.LAZY)
	private List<Doacao> doacoes;
	
}
