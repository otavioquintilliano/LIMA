package br.com.senaidev.cadastro.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_endereco")
	private long id_endereco;
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "numero_casa")
	private int numero_casa;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "estado")
	private String estado;

	public Endereco(long id_endereco, String rua, int numero_casa, String bairro, String cidade, String estado) {
		super();
		this.id_endereco = id_endereco;
		this.rua = rua;
		this.numero_casa = numero_casa;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(long id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(int numero_casa) {
		this.numero_casa = numero_casa;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
