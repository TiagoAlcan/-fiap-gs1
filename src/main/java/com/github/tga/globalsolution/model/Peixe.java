package com.github.tga.globalsolution.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "peixes")
public class Peixe extends AbstractEntity<Long>{

	@Column(nullable = false, length = 50, unique = true)
	private String nome;
	
	@Column(nullable = false, length = 500)
	private String descricao;
	
	@Column(nullable = false, columnDefinition = "NUMERIC(15,2)")
	private BigDecimal peso;
	
	@Column(columnDefinition = "DATE")
	private LocalDate dataCatag;

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

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public LocalDate getDataCatag() {
		return dataCatag;
	}

	public void setDataCatag(LocalDate dataCatag) {
		this.dataCatag = dataCatag;
	}
	
	
	
}
