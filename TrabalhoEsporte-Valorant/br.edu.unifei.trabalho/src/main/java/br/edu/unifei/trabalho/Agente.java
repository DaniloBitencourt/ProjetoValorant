package br.edu.unifei.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Agente {
	private String nome;
	private String classe;
	private List<Habilidade> habilidades = new ArrayList<Habilidade>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public List<Habilidade> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}
}
