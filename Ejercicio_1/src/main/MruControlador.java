package main;
import dol.MruModel;

public class MruControlador {
	public double CalculoVelocidad (MruModel mruModel) {
		double result = mruModel.getDistancia()/mruModel.getTiempo();
		System.out.print("Calculando...\n");
		return result;
	}

}
