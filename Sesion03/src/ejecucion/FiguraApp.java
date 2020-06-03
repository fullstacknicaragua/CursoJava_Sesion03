package ejecucion;

import polimorfismo.*;

public class FiguraApp {
	public static void main(String[] arg) {
		Figura r=new Rectangulo();
		r.setDatos(4, 3);
		System.out.println("�rea del rect�ngulo: " + r.obtenerArea());
		Figura t=new Triangulo();
		t.setDatos(4, 3);
		System.out.println("�rea del tri�ngulo: " + t.obtenerArea());
	}
}
