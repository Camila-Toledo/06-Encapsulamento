package br.com.glandata.model;

import java.util.Objects;

public class Animal {

	private String tipo;
	private String tipoAlimentacao;
	private String meioLocomocao;
	private Integer idadeMaxima;
	private String nome;

	public Animal() {

	}

	public Animal(String tipo, String meioLocomocao, String nome) {
		this.tipo = tipo;
		this.meioLocomocao = meioLocomocao;
		this.nome = nome;
	}

	public Animal(String tipo, String tipoAlimentacao, String meioLocomocao, Integer idadeMaxima, String nome) {
		this.tipo = tipo;
		this.tipoAlimentacao = tipoAlimentacao;
		this.meioLocomocao = meioLocomocao;
		this.idadeMaxima = idadeMaxima + 5;
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}

	public String getMeioLocomocao() {
		return meioLocomocao;
	}

	public void setMeioLocomocao(String meioLocomocao) {
		this.meioLocomocao = meioLocomocao;
	}

	public Integer getIdadeMaxima() {
		return idadeMaxima;
	}

	public void setIdadeMaxima(Integer idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Animal [tipo=" + tipo + ", tipoAlimentacao=" + tipoAlimentacao + ", meioLocomocao=" + meioLocomocao
				+ ", idadeMaxima=" + idadeMaxima + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idadeMaxima, meioLocomocao, nome, tipo, tipoAlimentacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(idadeMaxima, other.idadeMaxima) && Objects.equals(meioLocomocao, other.meioLocomocao)
				&& Objects.equals(nome, other.nome) && Objects.equals(tipo, other.tipo)
				&& Objects.equals(tipoAlimentacao, other.tipoAlimentacao);
	}

}
