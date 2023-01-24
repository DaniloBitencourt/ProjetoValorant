package br.edu.unifei.trabalho;

public class FaseGrupos extends Campeonato {
	public FaseGrupos(Origem origem) {
		super(origem);
		// TODO Auto-generated constructor stub
	}
	private int quantidadeGrupos;
	private int quantidadeClassificados;
	public int getQuantidadeGrupos() {
		return quantidadeGrupos;
	}
	public void setQuantidadeGrupos(int quantidadeGrupos) {
		this.quantidadeGrupos = quantidadeGrupos;
	}
	public int getQuantidadeClassificados() {
		return quantidadeClassificados;
	}
	public void setQuantidadeClassificados(int quantidadeClassificados) {
		this.quantidadeClassificados = quantidadeClassificados;
	}	
}
