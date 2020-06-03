package clases;

/*
Modificadores de Acceso:
Public:
Métodos o atributos public pueden ser accedidos desde:
01. La misma clase.
02. Otras clases del mismo paquete.
03. subclases (Herencia)
04. Desde cualquier otra clase del proyecto sin importar el paquete.
Protected:
01. La misma clase.
02. Otras clases del mismo paquete.
03. subclases (Herencia)
Default:
01. La misma clase.
02. Otras clases del mismo paquete.
Private:
01. La misma clase.
 */
public class Persona {
	public String nombre, apellido;
	public int anioNacimiento;
	char sexo;
	float estatura;
	
	public Persona() {}
	public Persona(char psexo) {sexo=psexo;}
	
	//	public float getEstatura() {
	//		return estatura;		
	//	}
	public String getEstatura() {
		String descripcionEstatura="";
		if (estatura<1.65) {descripcionEstatura="Estatura Baja.";}
		else if (estatura>1.65 && estatura>1.80) {descripcionEstatura="Estatura Promedio.";}
		else {descripcionEstatura="Estatura Alta.";}
		
		return descripcionEstatura;
		
	}
	public void setEstatura(float pestatura) {estatura=pestatura;}
	
	public String retornarNombreCompleto() {
		return nombre + " " + apellido;
	}
	public int retornarEdad() {
		return calcularEdad();
	}
	private int calcularEdad() {
		return 2020 - anioNacimiento;
	}
	public String retornarDescripcionSexo() {
		String descSexo="";
		switch (sexo) { case 'm': descSexo="Masculino"; break; case 'f': descSexo="Femenino"; break; default: descSexo="";};
		return descSexo;
	}
}
