package Controller;
import Models.ConversionModel;

public class ConversionController {

	public double CelciusaFa (ConversionModel Celcius) {
		return (1.8* Celcius.getCelcius()) + 32;
	
	}
}
