package View;
import Model.CalculoPrimoModel;
import java.util.Scanner;

public class CalculoPrimoView {
	
	public CalculoPrimoModel imputModel() {
		CalculoPrimoModel calculo=new CalculoPrimoModel();
		Scanner scan =new Scanner(System.in);
		System.out.print("Ingrese Numero");
		calculo.setNumero(scan.nextInt());
		return calculo;
	}
	
	public void result (String resultado) {
		System.out.print("El resultado es\n" + resultado);
	}
		

}
