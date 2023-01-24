package br.edu.unifei.trabalho;

public class Internacional implements Origem {
	private String pais;
	private int viagem;
	public int custos() {
		// TODO Auto-generated method stub
		return 50000 + viagem;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getViagem() {
		return viagem;
	}
	public void setViagem(int viagem) {
		this.viagem = viagem;
	}
	
}
