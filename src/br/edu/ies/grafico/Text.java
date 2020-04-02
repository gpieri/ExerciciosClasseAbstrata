package br.edu.ies.grafico;

import java.awt.Color;
import java.awt.Graphics;

public class Text extends Desenhavel {

	private String text;
	private int x;
	private int y;
	
	public Text(String text, int x, int y) {
		this.text = text;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void desenhar(Graphics g) {
		g.setColor(Color.black);
		g.drawString(text, x, y);
	}

}
