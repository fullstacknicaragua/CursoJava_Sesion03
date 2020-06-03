package polimorfismo;

public class Rectangulo extends Figura {
	@Override
	public float obtenerArea() {
		return ancho * alto;
	};
}