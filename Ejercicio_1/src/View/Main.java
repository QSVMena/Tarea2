package View;
import Controlador.MruControlador;

public class Main {

	public static void main(String[] args) {
		MruView mruView = new MruView();
		
		MruControlador mruController = new MruControlador();
		double resultado = 0;
		resultado = mruController.CalculoVelocidad(mruView.ImputMru());
		mruView.result(resultado);
		
	}

}
