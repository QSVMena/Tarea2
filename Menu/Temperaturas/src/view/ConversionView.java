package view;
import Models.ConversionModel;
import java.util.Scanner;

import Controller.ConversionController;

public class ConversionView {
	private static ConversionController conversion = new ConversionController();

	private static ConversionModel Celcius(Scanner scan) {
		ConversionModel celciusaFa = new ConversionModel();
		System.out.println("Ingresar Grados Celcius: ");
		celciusaFa.setCelcius(scan.nextDouble());
		return celciusaFa;
		
	}
	
	public static void resultCelcius(Scanner scan) {
		double result= conversion.CelciusaFa(Celcius(scan));
		System.out.println("La conversion de Celcius a Fa es: "+result);
	}
}
