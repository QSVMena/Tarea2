package View;
import Controlador.MruControlador;
import Controlador.ProyectilController;

public class Main {

	public static void main(String[] args) {
		//MruView mruView = new MruView();
		
		//MruControlador mruController = new MruControlador();
		//double resultado = 0;
		//resultado = mruController.CalculoVelocidad(mruView.ImputMru());
		//mruView.result(resultado);
		
		ProyectilView proyectilView = new ProyectilView();
		
		ProyectilController proyectilController = new ProyectilController();
		double result = 0;
		result = proyectilController.CalculoProyectil(proyectilView.imputModel());
		proyectilView.resultado(result);
	}

}
