package ejecucion;

import polimorfismo.*;

public class FiguraApp {
	public static void main(String[] arg) {
		Figura r=new Rectangulo();
		r.setDatos(4, 3);
		System.out.println("Área del rectángulo: " + r.obtenerArea());
		Figura t=new Triangulo();
		t.setDatos(4, 3);
		System.out.println("Área del triángulo: " + t.obtenerArea());
	}
}
