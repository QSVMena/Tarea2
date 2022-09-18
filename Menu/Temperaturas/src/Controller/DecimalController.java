package Controller;
import Models.DecimalModel;

public class DecimalController {

	public int DecimalaBinario(DecimalModel decimalModel) {
		
		 int numero=0, exp=0, digito=0;
		 double binario=0;
		 numero= decimalModel.getNumeroDecimal();
		
		 while(numero!=0){
             digito = numero %2;           
             binario = binario + digito * Math.pow(10, exp);                                                   
             exp++;
             numero = numero/2;
           }
		 return (int)binario;

	}
}
