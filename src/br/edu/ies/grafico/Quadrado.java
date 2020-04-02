package br.edu.ies.grafico;

import java.awt.Color;
import java.awt.Graphics;

public class Quadrado extends Desenhavel {

	private int side;
	private int x;
	private int y;
	
	public Quadrado(int side, int x, int y) {
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void desenhar(Graphics g) {
		g.setColor(Color.blue);
		g.drawRect(x, y, 50 + 2 * side, 50 + 2 * side);
		g.fillRect(x, y, 50 + 2 * side, 50 + 2 * side);
	}

}
