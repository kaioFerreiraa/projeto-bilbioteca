package com.projetobiblioteca.biblioteca.model.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="doacao")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Doacao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="id_professor")
	private Professor professor;
	
	@OneToOne
	@JoinColumn(name="id_didatico")
	private Didaticos didaticos;
	
	@OneToOne
	@JoinColumn(name="id_periodico")
	private Periodicos periodicos;
	
	@Column(name="data_doacao")
	private LocalDate dataDoacao;
	
	@ManyToOne
	@JoinColumn(name="id_biblioteca")
	private Biblioteca biblioteca;
	
	
}
