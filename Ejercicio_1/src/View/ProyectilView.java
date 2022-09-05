package View;
import java.util.Scanner;
import Model.ProyectilModel;

public class ProyectilView {
	
	public ProyectilModel imputModel () {
		ProyectilModel proyectilModel = new ProyectilModel();
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese Angulo\n>");
		proyectilModel.setAngulo(scan.nextDouble());
		System.out.print("Ingrese Velocidad Inicial\n>");
		proyectilModel.setVelocidad(scan.nextDouble());
		return proyectilModel;
	}
	
	public void resultado (double result) {
		System.out.printf("Calculo de la Altura del proyectil\n:%.2f", result);
	}
	
	

}
