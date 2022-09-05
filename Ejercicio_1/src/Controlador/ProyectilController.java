package Controlador;
import Model.ProyectilModel;

public class ProyectilController {
	
	public double CalculoProyectil (ProyectilModel Calculo) {
		double VelocidadAlCuadrado= Calculo.getVelocidad()*Calculo.getVelocidad();
		double CalculoSeno =Math.pow(Math.sin(Math.toRadians(Calculo.getAngulo())),2) ;
		double result = VelocidadAlCuadrado*CalculoSeno/(2*10f);
		return result;
	}

}
