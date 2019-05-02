package com.projetoSeas.domain;

import java.util.ArrayList;
import java.util.List;

public class Talhao {
	
	private Integer id;
	private String nome;
	private String descricao;
	
	private List<Cultura> culturas = new ArrayList<>();
	
	private List<Praga> pragas = new ArrayList<>();
	
	private List<Doenca> doencas = new ArrayList<>();
	
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
