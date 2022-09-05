package Controlador;
import Model.CalculoPrimoModel;

public class CalculoPrimoControlador {
	public String CalculoPrimo (CalculoPrimoModel Calculo) {
		int Contador=0;
		String result ="";
		for(int i=1; i<=Calculo.getNumero();i++ ) {
			if((Calculo.getNumero()% i)==0) {
				Contador++;
			}	
		}
		
		if(Contador <= 2)
        {
            result ="Es Numero Primo";
        }else{
            result="El numero no es primo";
        }
		return result;
	}

}
