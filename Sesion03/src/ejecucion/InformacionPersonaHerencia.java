package ejecucion;

import clases.*;

public class InformacionPersonaHerencia {
	public static void main(String[] args) {
		Empleado em=new Empleado();
		em.nombre="Jorge";
		em.apellido="Torres";
		em.anioNacimiento=1987;
		em.setEstatura(1.77f);
		em.setCargo("Gerente");
		em.setEmpresa("Mi Empresa");
		em.setUbicacion("Informática");
		em.setSalario(50000);
		Estudiante es=new Estudiante();
		es.nombre="Antonio";
		es.apellido="Aguirre";
		es.anioNacimiento=1986;
		es.setEstatura(1.62f);

		System.out.println("Empleado: " + em.retornarNombreCompleto());
		System.out.println("Edad: " + em.retornarEdad());
		System.out.println("Sexo: " + em.retornarDescripcionSexo());
		System.out.println("Estatura: " + em.getEstatura());
		System.out.println("Empresa: " + em.getEmpresa());
		System.out.println("Cargo: " + em.getCargo());
		System.out.println("Ubicación: " + em.getUbicacion());
		System.out.println("Salario: " + em.getSalario());
		//
		System.out.println("");
		System.out.println("Estudiante: " + es.retornarNombreCompleto());
		System.out.println("Edad: " + es.retornarEdad());
		System.out.println("Sexo: " + es.retornarDescripcionSexo());
		System.out.println("Estatura: " + es.getEstatura());
	}
}