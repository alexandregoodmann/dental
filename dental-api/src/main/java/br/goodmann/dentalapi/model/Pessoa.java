package br.goodmann.dentalapi.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA")
public class Pessoa extends BaseModel {

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * 
	 * @Column(name = "IDPESSOA", insertable = false) private Integer id;
	 */
	private String nome;

	private String email;

	private String telefone;

	private String celular;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
}
