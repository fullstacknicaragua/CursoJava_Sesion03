package excepciones;
import java.util.*;

public class EjemploExcepciones {
	public static void main(String[] args) {
		try {
			int dividendo, divisor, resultado;
			Scanner entrada=new Scanner(System.in);
			System.out.print("Digite el dividendo: ");
			dividendo=entrada.nextInt();
			System.out.print("Digite el divisor: ");
			divisor=entrada.nextInt();
			resultado=dividendo/divisor;
			System.out.println("El resultado es: " + resultado);
			entrada.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Ha sucedido un error al tratar de realizar la operaci�n. Los valores deben ser num�ricos.");
		}
		catch(ArithmeticException e) {
			System.out.println("Ha sucedido un error al tratar de realizar la operaci�n. El divisor debe ser distinto a cero.");
			//e.printStackTrace();
		}
		catch(Exception e) {
			System.out.print("Ha sucedido el siguiente error: " + e);
			//e.printStackTrace();
		}
		finally {
			//Se ejecuta sin importar si se ejecut� el bloque de c�digo correctamente o si se captur� un error...
			System.out.println("----------------------------------");
			System.out.print("Programa Finalizado...");
		}	
	}
}
//java.util.InputMismatchException
//java.lang.ArithmeticException