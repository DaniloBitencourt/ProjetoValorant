package br.edu.unifei.trabalho;

public class MataMata extends Campeonato {
	public MataMata(Origem origem) {
		super(origem);
		// TODO Auto-generated constructor stub
	}
	private int quantidadeFases;
	private Time campeao;
	public int getQuantidadeFases() {
		return quantidadeFases;
	}
	public void setQuantidadeFases(int quantidadeFases) {
		this.quantidadeFases = quantidadeFases;
	}
	public Time getCampeao() {
		return campeao;
	}
	public void setCampeao(Time campeao) {
		this.campeao = campeao;
	}
	
}
