package View;
import Controlador.CalculoPrimoControlador;
import Controlador.FactorialController;
import Controlador.MruControlador;
import Controlador.ProyectilController;

public class Main {

	public static void main(String[] args) {
		MruView mruView = new MruView();
		
		MruControlador mruController = new MruControlador();
		double resultado = 0;
		resultado = mruController.CalculoVelocidad(mruView.ImputMru());
		mruView.result(resultado);
		System.out.println("\n");
		
		ProyectilView proyectilView = new ProyectilView();
		
		ProyectilController proyectilController = new ProyectilController();
		double result = 0;
		result = proyectilController.CalculoProyectil(proyectilView.imputModel());
		proyectilView.resultado(result);
		System.out.println("\n");
		
		CalculoPrimoView calcular = new CalculoPrimoView();
		
		CalculoPrimoControlador CalculoController = new CalculoPrimoControlador();
		String respuesta = "";
		respuesta =CalculoController.CalculoPrimo(calcular.imputModel());
		calcular.result(respuesta);
		System.out.println("\n");
		
		FactorialView factor = new FactorialView();	
		
		FactorialController FactorController = new FactorialController();
		result= 0;
		result= FactorController.Factorial(factor.Factorial());
		factor.resultado(result);
	
		
	}

}
