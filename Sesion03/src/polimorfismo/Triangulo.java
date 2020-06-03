package polimorfismo;

public class Triangulo extends Figura {
	@Override
	public float obtenerArea() {
		return (ancho * alto)/2;
	};
}
