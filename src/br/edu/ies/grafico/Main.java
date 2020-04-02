package br.edu.ies.grafico;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Desenhavel> d = new ArrayList<>();
		d.add(new Circulo(30, 0, 0));
		d.add(new Quadrado(30, 0, 120));
		d.add(new Text("Dev", 0, 300));
		d.add(new Retangulo(30,60, 0, 400));
		Painel painel = new Painel(d);
	}
	
}
