package br.edu.unifei.trabalho;

public abstract class Habilidade {
	private String nome;
	private int custo;
	private Estado estado;
	private Funcao funcao;
	public void alternar() {
		estado.inverter(this);
	}
	public Habilidade(Funcao funcao) {
		 this.funcao = funcao;
	}
	public void acao() {
		funcao.acao();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Funcao getFuncao() {
		return funcao;
	}
	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}
}
