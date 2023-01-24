package br.edu.unifei.trabalho;

public class Suporte implements Funcao {
	private String efeito;
	private int duracaoEfeito;
	public void acao() {
		System.out.println("O efeito " + efeito + " foi aplicado por " + duracaoEfeito + " segundos");
	}
	public String getEfeito() {
		return efeito;
	}
	public void setEfeito(String efeito) {
		this.efeito = efeito;
	}
	public int getDuracaoEfeito() {
		return duracaoEfeito;
	}
	public void setDuracaoEfeito(int duracaoEfeito) {
		this.duracaoEfeito = duracaoEfeito;
	}
	
}
