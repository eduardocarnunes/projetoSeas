package com.projetoSeas.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Talhao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String descricao;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="TALHAO_CULTURA", 
		joinColumns=@JoinColumn(name="talhao_id"),
		inverseJoinColumns=@JoinColumn(name="cultura_id")
	)	
	private List<Cultura> culturas = new ArrayList<>();
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="TALHAO_PRAGAS", 
		joinColumns=@JoinColumn(name="talhao_id"),
		inverseJoinColumns=@JoinColumn(name="praga_id")
	)	
	private List<Praga> pragas = new ArrayList<>();
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="DOENCA_PRAGAS", 
		joinColumns=@JoinColumn(name="talhao_id"),
		inverseJoinColumns=@JoinColumn(name="doenca_id")
	)	
	private List<Doenca> doencas = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="estacao_id")
	private Estacao estacao;
	
	public Talhao() {
		
	}

	public Talhao(Integer id, String nome, String descricao, Estacao estacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.estacao = estacao;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Cultura> getCulturas() {
		return culturas;
	}

	public void setCulturas(List<Cultura> culturas) {
		this.culturas = culturas;
	}
	
	/**
	public List<Praga> getPragas() {
		return pragas;
	}

	public void setPragas(List<Praga> pragas) {
		this.pragas = pragas;
	}

	public List<Doenca> getDoencas() {
		return doencas;
	}

	public void setDoencas(List<Doenca> doencas) {
		this.doencas = doencas;
	}
	

	public Estacao getEstacao() {
		return estacao;
	}

	public void setEstacao(Estacao estacao) {
		this.estacao = estacao;
	}
	**/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Talhao other = (Talhao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
