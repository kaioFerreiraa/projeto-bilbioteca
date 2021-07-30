package com.projetobiblioteca.biblioteca.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="periodico")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@PrimaryKeyJoinColumn(name="id_livro")
public class Periodicos extends Livros implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer volume;

	@Column(name="numero_emprestimos")
	private Integer numeroEmprestimos;
}
