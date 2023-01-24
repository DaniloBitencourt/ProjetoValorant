package br.edu.unifei.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nome;
	private String organizacao;
	private List<Jogador> jogadores = new ArrayList<Jogador>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(String organizacao) {
		this.organizacao = organizacao;
	}
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
}
