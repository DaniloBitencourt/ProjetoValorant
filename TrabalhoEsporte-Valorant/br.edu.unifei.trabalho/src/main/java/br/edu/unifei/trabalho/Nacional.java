package br.edu.unifei.trabalho;

public class Nacional implements Origem {
	private String regiao;
	private int locomocao;
	public int custos() {
		// TODO Auto-generated method stub
		return 50000 + locomocao;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public int getLocomocao() {
		return locomocao;
	}
	public void setLocomocao(int locomocao) {
		this.locomocao = locomocao;
	}
	
}
