package polimorfismo;

public abstract class Figura {
	protected int ancho, alto;
	
	public void setDatos (int x, int y) {
		ancho=x;
		alto=y;
	}
	void mostrarDatos() {
		System.out.println(ancho);
		System.out.println(alto);
	}
	public abstract float obtenerArea();
}