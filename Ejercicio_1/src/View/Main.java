package View;
import Controlador.CalculoPrimoControlador;
import java.util.Scanner;
import Controlador.FactorialController;
import Controlador.MruControlador;
import Controlador.ProyectilController;

public class Main {

	public static void main(String[] args) {
		
		int Opcion =0;
		Scanner scan = new Scanner(System.in);
		do {
			
			System.out.println("1: Calcular la velocidad del MRU");
			System.out.println("2: Calcular Altura Maxima de un proyectil");
			System.out.println("3: Calcular Numeros Primos");
			System.out.println("4: Calcular Factorial");
			System.out.println("5: Salir");
			
			System.out.println("\nIngresar Opcion");
			Opcion = scan.nextInt();
			
			switch (Opcion) {
			case 1: 
				System.out.println("\nCalcular la velocidad del MRU");
				MruView mruView = new MruView();
				
				MruControlador mruController = new MruControlador();
				double resultado = 0;
				resultado = mruController.CalculoVelocidad(mruView.ImputMru());
				mruView.result(resultado);
				System.out.println("\n");
			
				break;
			case 2:
				System.out.println("\nCalcular la Altura maxima de un proyectil");
				
				ProyectilView proyectilView = new ProyectilView();
				
				ProyectilController proyectilController = new ProyectilController();
				double result = 0;
				result = proyectilController.CalculoProyectil(proyectilView.imputModel());
				proyectilView.resultado(result);
				System.out.println("\n");
				break;
				
			case 3:
				System.out.println("\nCalcular Numeros Primos");
				
				CalculoPrimoView calcular = new CalculoPrimoView();
				
				CalculoPrimoControlador CalculoController = new CalculoPrimoControlador();
				String respuesta = "";
				respuesta =CalculoController.CalculoPrimo(calcular.imputModel());
				calcular.result(respuesta);
				System.out.println("\n");
				break;
			case 4: 
				System.out.println("\nCalcular Factorial");
				
				FactorialView factor = new FactorialView();	
				
				FactorialController FactorController = new FactorialController();
				result= 0;
				result= FactorController.Factorial(factor.Factorial());
				factor.resultado(result);
				break;
			}
			
			
		}while (Opcion != 5);
	
		System.out.println("Programa Finalizado");
	}

}
