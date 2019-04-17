package br.edu.ies.mp3;

public class MusicaMP3 {
	private String nome;
	private String autor;
	private String ano;
	private int estrelas;

	public MusicaMP3(String nome, String autor, String ano, int estrela) {
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
		this.estrelas = estrela;
	}
	
	public String getNome() {
		return nome;
	}

	public String getAutor() {
		return autor;
	}

	public String getAno() {
		return ano;
	}

	public int getEstrelas() {
		return estrelas;
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.autor + "\n Ano: "
				+ this.ano + "\n Estrelas: " + this.estrelas;
	}
}