package View;
import java.util.Scanner;
import Model.MruModel;

public class MruView {
	
	public MruModel ImputMru() {
		MruModel mruModel = new MruModel();
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresar distancia(mts)\n>");
		mruModel.setDistancia(scan.nextDouble());
		System.out.print("Ingresar Tiempo(seg)\n>");
		mruModel.setTiempo(scan.nextDouble());
		return mruModel;	
	}
	
	public void result (double velocidad) {
		System.out.print("Calculo velocidad (m/s) "+velocidad);
	}

}
