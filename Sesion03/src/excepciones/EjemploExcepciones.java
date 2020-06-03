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
			System.out.println("Ha sucedido un error al tratar de realizar la operación. Los valores deben ser numéricos.");
		}
		catch(ArithmeticException e) {
			System.out.println("Ha sucedido un error al tratar de realizar la operación. El divisor debe ser distinto a cero.");
			//e.printStackTrace();
		}
		catch(Exception e) {
			System.out.print("Ha sucedido el siguiente error: " + e);
			//e.printStackTrace();
		}
		finally {
			//Se ejecuta sin importar si se ejecutó el bloque de código correctamente o si se capturó un error...
			System.out.println("----------------------------------");
			System.out.print("Programa Finalizado...");
		}	
	}
}
//java.util.InputMismatchException
//java.lang.ArithmeticException