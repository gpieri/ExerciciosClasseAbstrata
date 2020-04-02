package br.edu.ies.grafico;

import java.awt.Color;
import java.awt.Graphics;

public class Retangulo extends Desenhavel {

	private int side;
	private int base;
	private int x;
	private int y;
	
	public Retangulo(int side, int base, int x, int y) {
		this.side = side;
		this.base = base;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void desenhar(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.drawRect(x, y, 50 + 2 * base, 50 + 2 * side);
		g.fillRect(x, y, 50 + 2 * base, 50 + 2 * side);
	}

}
