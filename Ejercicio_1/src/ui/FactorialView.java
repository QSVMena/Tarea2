package ui;
import java.util.Scanner;

import dol.FactorialModel;

public class FactorialView {
	 
	public FactorialModel Factorial() {
		FactorialModel factorial = new FactorialModel();
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingresar numero factorial");
		factorial.setNumero(scan.nextInt());
		return factorial;
	}
	
	public void resultado (double result) {
		System.out.println("El numero factorial es "+ result);
	}

}
