package ejecucion;

import clases.Persona;

public class InformacionPersona {
	public static void main(String[] args) {
		Persona p=new Persona('m');
		p.nombre="Jorge";
		p.apellido="Torres";
		p.anioNacimiento=1987;
		p.setEstatura(1.77f);
		Persona p2=new Persona();
		p2.nombre="Antonio";
		p2.apellido="Aguirre";
		p2.anioNacimiento=1986;
		p2.setEstatura(1.62f);

		System.out.println("Nombre Completo: " + p.retornarNombreCompleto());
		System.out.println("Edad: " + p.retornarEdad());
		System.out.println("Sexo: " + p.retornarDescripcionSexo());
		System.out.println("Estatura: " + p.getEstatura());
		//
		System.out.println("");
		System.out.println("Nombre Completo: " + p2.retornarNombreCompleto());
		System.out.println("Edad: " + p2.retornarEdad());
		System.out.println("Sexo: " + p2.retornarDescripcionSexo());
		System.out.println("Estatura: " + p2.getEstatura());
		}
}
