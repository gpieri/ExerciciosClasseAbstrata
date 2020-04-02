package br.edu.ies.mp3;

import java.util.ArrayList;

public class PlayList {
	private ArrayList<MusicaMP3> musicas;
	private OrdenadorTemplate ordenador;

	public PlayList(ModoDeReproducao modo) {
		musicas = new ArrayList<MusicaMP3>();
		setModoDeReproducao(modo);
	}

	public void setModoDeReproducao(ModoDeReproducao modo) {
		ordenador = modo.getOrdenador();
	}

	public void adicionarMusica(String nome, String autor, String ano,
			int estrela) {
		musicas.add(new MusicaMP3(nome, autor, ano, estrela));
	}

	public void mostrarListaDeReproducao() {
		ArrayList<MusicaMP3> novaLista = new ArrayList<MusicaMP3>();
		novaLista = ordenador.ordenarMusica(musicas);

		for (MusicaMP3 musica : novaLista) {
			System.out.println(musica);
		}
	}
}