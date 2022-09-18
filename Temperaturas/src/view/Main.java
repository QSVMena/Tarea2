package view;
import Models.DecimalModel;
import Controller.DecimalController;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	DecimalView decimalView = new DecimalView();
	int Opcion =0;
	
	do {
		System.out.println("1: Conversion de decimal a binario");
		System.out.println("2: Conversion de Celcius a Fahrenheint");
		System.out.println("3: Salir");
		System.out.println("Ingresar Opcion");
		Opcion =scan.nextInt();
		
		switch(Opcion) {
		
		case 1:
			decimalView.resultado();
			break;
		case 2:
			ConversionView.resultCelcius(scan);
			break;
		
		}
		
		
	}while(Opcion!= 3);

	}

}
