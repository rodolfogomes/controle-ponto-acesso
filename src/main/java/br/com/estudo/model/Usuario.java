package br.com.estudo.model;

import java.time.LocalDateTime;

public class Usuario {
	
	private int codigoUsuario;
	
	private String nome;
	
	private CategoriaUsuario categoriaUsuario;
	
	private Empresa empresa;
	
	private NivelDeAcesso nivelDeAcesso;
	
	private JornadaDeTrabalho jornadaDeTrabalho;
	
	private LocalDateTime dataInicioJornada;
	
	private LocalDateTime dataFimJornada;
	
	
	

	

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CategoriaUsuario getCategoriaUsuario() {
		return categoriaUsuario;
	}

	public void setCategoriaUsuario(CategoriaUsuario categoriaUsuario) {
		this.categoriaUsuario = categoriaUsuario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public NivelDeAcesso getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public void setNivelDeAcesso(NivelDeAcesso nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}

	public JornadaDeTrabalho getJornadaDeTrabalho() {
		return jornadaDeTrabalho;
	}

	public void setJornadaDeTrabalho(JornadaDeTrabalho jornadaDeTrabalho) {
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}
	
	public LocalDateTime getDataInicioJornada() {
		return dataInicioJornada;
	}

	public void setDataInicioJornada(LocalDateTime dataInicioJornada) {
		this.dataInicioJornada = dataInicioJornada;
	}

	public LocalDateTime getDataFimJornada() {
		return dataFimJornada;
	}

	public void setDataFimJornada(LocalDateTime dataFimJornada) {
		this.dataFimJornada = dataFimJornada;
	}
	
	

}
