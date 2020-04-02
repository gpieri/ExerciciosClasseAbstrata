package br.edu.ies.grafico;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Desenhavel {

	private int raio;
	private int x;
	private int y;
	
	public Circulo(int raio, int x, int y) {
		this.raio = raio;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void desenhar(Graphics g) {
		g.setColor(Color.red);
		g.drawOval(x, y, 50 + 2 * raio, 50 + 2 * raio);
		g.fillOval(x, y, 50 + 2 * raio, 50 + 2 * raio);
	}

}
