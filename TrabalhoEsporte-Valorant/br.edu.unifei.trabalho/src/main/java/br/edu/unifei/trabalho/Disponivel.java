package br.edu.unifei.trabalho;

public class Disponivel implements Estado {
	private int quantidade;
	public void inverter(Habilidade h) {
		h.setEstado(new Utilizado());
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
