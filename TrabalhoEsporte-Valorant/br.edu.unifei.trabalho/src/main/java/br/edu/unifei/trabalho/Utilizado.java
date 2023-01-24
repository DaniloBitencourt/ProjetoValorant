package br.edu.unifei.trabalho;

public class Utilizado implements Estado {
	private int tempoUtilizado;
	public void inverter(Habilidade h) {
		h.setEstado(new Disponivel());
	}
	public int getTempoUtilizado() {
		return tempoUtilizado;
	}
	public void setTempoUtilizado(int tempoUtilizado) {
		this.tempoUtilizado = tempoUtilizado;
	}
	
}
