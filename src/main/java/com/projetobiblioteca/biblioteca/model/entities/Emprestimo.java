package com.projetobiblioteca.biblioteca.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="emprestimo")
@Getter @Setter
@AllArgsConstructor
public class Emprestimo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy="emprestimo", fetch=FetchType.EAGER)
	private List<InfoEmprestimo> infoEmprestimos;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
}
