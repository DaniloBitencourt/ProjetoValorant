package br.edu.unifei.trabalho;

public class Dano implements Funcao {
	private int quantidadeDano;
	public void acao() {
		System.out.println("A habilidade causou "+ quantidadeDano + " de dano.");
	}
	public int getQuantidadeDano() {
		return quantidadeDano;
	}
	public void setQuantidadeDano(int quantidadeDano) {
		this.quantidadeDano = quantidadeDano;
	}
	
}
