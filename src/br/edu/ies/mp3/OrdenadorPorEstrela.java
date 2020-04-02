package br.edu.ies.mp3;

public class OrdenadorPorEstrela extends OrdenadorTemplate {

	@Override
	public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
		if (musica1.getEstrelas() > musica2.getEstrelas()) {
			return true;
		}
		return false;
	}

}