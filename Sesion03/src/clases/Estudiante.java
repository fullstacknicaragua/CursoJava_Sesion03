package clases;

public class Estudiante extends Persona {
	private String centroEstudio;
	private int anioIngreso;
	private String nivelEducativo; // (Primaria, Secundaria, Técnico, Universidad)
	private String curso; // (1er, 2do, 3er...)
	public String getCentroEstudio() {
		return centroEstudio;
	}
	public void setCentroEstudio(String centroEstudio) {
		this.centroEstudio = centroEstudio;
	}
	public int getAnioIngreso() {
		return anioIngreso;
	}
	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}
	public String getNivelEducativo() {
		return nivelEducativo;
	}
	public void setNivelEducativo(String nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}