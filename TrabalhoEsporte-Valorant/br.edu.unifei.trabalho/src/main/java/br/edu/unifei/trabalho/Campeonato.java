package br.edu.unifei.trabalho;

import java.util.ArrayList;
import java.util.List;

public abstract class Campeonato {
	private String apresentador;
	private String canalTransmissao;
	private List<Time> times = new ArrayList<Time>();
	private List<Partida> partidas = new ArrayList<Partida>();
	private Origem origem;
	public Campeonato(Origem origem) {
		this.origem = origem;
	}
	public int custos() {
		return origem.custos();
	}
	public String getApresentador() {
		return apresentador;
	}
	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}
	public String getCanalTransmissao() {
		return canalTransmissao;
	}
	public void setCanalTransmissao(String canalTransmissao) {
		this.canalTransmissao = canalTransmissao;
	}
	public List<Time> getTimes() {
		return times;
	}
	public void setTimes(List<Time> times) {
		this.times = times;
	}
	public List<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
	
}
