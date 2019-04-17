package br.edu.ies.grafico;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo implements Desenhavel {

	private int raio;
	
	public Circulo(int raio) {
		this.raio = raio;
	}
	
	@Override
	public void desenhar(Graphics g) {
		g.drawOval(50, 50, 50 + 2 * raio, 50 + 2 * raio);
		g.setColor(Color.RED);
		g.fillOval(50, 50, 50 + 2 * raio, 50 + 2 * raio);
	}

}
