package view;
import Models.DecimalModel;
import java.util.Scanner;
import Controller.DecimalController;

public class DecimalView {

	private static DecimalController Controller = new DecimalController();
	
	public static DecimalModel Decimal() {
		
		DecimalModel decimales = new DecimalModel();
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresar numero decimal: ");
		decimales.setNumeroDecimal(scan.nextInt());
		return decimales;
	}
	
	public static void resultado () {
		int result =Controller.DecimalaBinario(Decimal());
		System.out.println("Conversion de decimal a binario es "+result);
	}
}
