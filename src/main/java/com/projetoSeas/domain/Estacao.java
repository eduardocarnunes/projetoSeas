package com.projetoSeas.domain;

import java.util.ArrayList;
import java.util.List;

public class Estacao {
	
	private Integer id;
	private String nome;
	private String latitude;
	private String longitute;
	private String temperaturaAR;
	private String umidadeAR;
	private String direcaoVento;
	private String pontoOrvalho;
	private String pluviometro;
	private String umidadeFoliar;
	private String radiacaoSolar;
	
	private List<Talhao> talhoes = new ArrayList<>();
	
	private Propriedade propriedade;
	
	public Estacao() {
		
	}

	public Estacao(Integer id, String nome, String latitude, String longitute, String temperaturaAR, String umidadeAR,
			String direcaoVento, String pontoOrvalho, String pluviometro, String umidadeFoliar, String radiacaoSolar,
			Propriedade propriedade) {
		super();
		this.id = id;
		this.nome = nome;
		this.latitude = latitude;
		this.longitute = longitute;
		this.temperaturaAR = temperaturaAR;
		this.umidadeAR = umidadeAR;
		this.direcaoVento = direcaoVento;
		this.pontoOrvalho = pontoOrvalho;
		this.pluviometro = pluviometro;
		this.umidadeFoliar = umidadeFoliar;
		this.radiacaoSolar = radiacaoSolar;
		this.propriedade = propriedade;
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

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitute() {
		return longitute;
	}

	public void setLongitute(String longitute) {
		this.longitute = longitute;
	}

	public String getTemperaturaAR() {
		return temperaturaAR;
	}

	public void setTemperaturaAR(String temperaturaAR) {
		this.temperaturaAR = temperaturaAR;
	}

	public String getUmidadeAR() {
		return umidadeAR;
	}

	public void setUmidadeAR(String umidadeAR) {
		this.umidadeAR = umidadeAR;
	}

	public String getDirecaoVento() {
		return direcaoVento;
	}

	public void setDirecaoVento(String direcaoVento) {
		this.direcaoVento = direcaoVento;
	}

	public String getPontoOrvalho() {
		return pontoOrvalho;
	}

	public void setPontoOrvalho(String pontoOrvalho) {
		this.pontoOrvalho = pontoOrvalho;
	}

	public String getPluviometro() {
		return pluviometro;
	}

	public void setPluviometro(String pluviometro) {
		this.pluviometro = pluviometro;
	}

	public String getUmidadeFoliar() {
		return umidadeFoliar;
	}

	public void setUmidadeFoliar(String umidadeFoliar) {
		this.umidadeFoliar = umidadeFoliar;
	}

	public String getRadiacaoSolar() {
		return radiacaoSolar;
	}

	public void setRadiacaoSolar(String radiacaoSolar) {
		this.radiacaoSolar = radiacaoSolar;
	}

	public List<Talhao> getTalhoes() {
		return talhoes;
	}

	public void setTalhoes(List<Talhao> talhoes) {
		this.talhoes = talhoes;
	}

	public Propriedade getPropriedade() {
		return propriedade;
	}

	public void setPropriedade(Propriedade propriedade) {
		this.propriedade = propriedade;
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
		Estacao other = (Estacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
