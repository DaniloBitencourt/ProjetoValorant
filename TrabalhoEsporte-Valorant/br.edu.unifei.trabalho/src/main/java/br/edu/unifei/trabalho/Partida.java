package br.edu.unifei.trabalho;

public class Partida {
	private int quantidadeRodadas;
	private Time time1;
	private Time time2;
	private Time vencedor;
	private Mapa mapa;
	Partida(Time time1, Time time2){
		this.time1 = time1;
		this.time2 = time2;
	}
	public int getQuantidadeRodadas() {
		return quantidadeRodadas;
	}
	public void setQuantidadeRodadas(int quantidadeRodadas) {
		this.quantidadeRodadas = quantidadeRodadas;
	}
	public Time getTime1() {
		return time1;
	}
	public void setTime1(Time time1) {
		this.time1 = time1;
	}
	public Time getTime2() {
		return time2;
	}
	public void setTime2(Time time2) {
		this.time2 = time2;
	}
	public Time getVencedor() {
		return vencedor;
	}
	public void setVencedor(Time vencedor) {
		this.vencedor = vencedor;
	}
	public Mapa getMapa() {
		return mapa;
	}
	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}
	
}
