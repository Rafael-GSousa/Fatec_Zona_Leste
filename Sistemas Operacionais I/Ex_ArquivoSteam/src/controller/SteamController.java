package controller;

public class SteamController implements CharSequence {
	
	String nomeJogo;
	int ano;
	String mes;
	double mediaJogadores;
	
	public SteamController(int ano, String mes, double mediaJogadores) {
		this.ano = ano;
		this.mes = mes;
		this.mediaJogadores = mediaJogadores;
	}
	
	
	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}

	public double getMediaJogadores() {
		return mediaJogadores;
	}

	public void setMediaJogadores(double mediaJogadores) {
		this.mediaJogadores = mediaJogadores;
	}

	@Override
	public String toString() {
		return getNomeJogo() + "|" + getMediaJogadores();
	}


	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

}