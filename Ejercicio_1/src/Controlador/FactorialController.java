package Controlador;
import Model.FactorialModel;
public class FactorialController {
	
	public double Factorial (FactorialModel Calculo) {
		double factorial = 1;
		for(double i = 1; i<=Calculo.getNumero(); i++) {
			
			factorial *= i;
		}
		
		return factorial ;
	}

}
