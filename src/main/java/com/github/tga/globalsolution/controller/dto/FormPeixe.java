package com.github.tga.globalsolution.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.github.tga.globalsolution.model.Peixe;

public class FormPeixe {

	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal peso;
	private LocalDate dataCatag;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	
	public FormPeixe toForm(Peixe peixe) {
		this.id = peixe.getId();
		this.nome = peixe.getNome();
		this.descricao = peixe.getDescricao();
		this.peso = peixe.getPeso();
		this.dataCatag = peixe.getDataCatag();
		return this;
	}
	
	public Peixe toModel() {
		Peixe peixe = new Peixe();
		peixe.setId(this.getId());
		peixe.setNome(this.getNome());
		peixe.setDescricao(this.getDescricao());
		peixe.setPeso(this.getPeso());
		peixe.setDataCatag(this.getDataCatag());
		return peixe;
	}
	
	
}
