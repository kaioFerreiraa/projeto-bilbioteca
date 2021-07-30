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
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="info_emprestimo")
@Getter @Setter
@AllArgsConstructor	
public class InfoEmprestimo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_livro")
	private Livros livro;
	
	@ManyToOne
	@JoinColumn(name="id_emprestimo")
	private Emprestimo emprestimo;
	
	@Column(name="data_emprestimo")
	private LocalDate dataEmprestimo;
	
	private Double multa;
	
	private Integer Status;

}
