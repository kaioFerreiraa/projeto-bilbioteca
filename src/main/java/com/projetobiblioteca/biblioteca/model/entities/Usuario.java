package com.projetobiblioteca.biblioteca.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="usuario")
@Getter @Setter
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String cpf;
	
	private Integer codigo;
	
	private Double saldo;
	
	private boolean devedor;
	
	@ManyToOne
	@JoinColumn(name="id_biblioteca")
	private Biblioteca biblioteca;
	
	@OneToMany(mappedBy="usuario")
	private List<Emprestimo> emprestimos;
	
	public Usuario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0.0;
	}
	
}
