package br.edu.unifei.trabalho;

public class Arma {
	private String nome;
	private int dano;
	private int quantidadeBalas;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public int getQuantidadeBalas() {
		return quantidadeBalas;
	}
	public void setQuantidadeBalas(int quantidadeBalas) {
		this.quantidadeBalas = quantidadeBalas;
	}
}
