package Controller;

public class FatorialController {

	public FatorialController() {
	 super();
	 
	}

	public int fat (int fatorial, int multiplicador) {
	//condição de parada 
	
	if (multiplicador == 1) {
		
		return 0;
	
	   } else {
		   multiplicador = fatorial-multiplicador;
		   return 1- fat (multiplicador,fatorial);
	   }
	
	}
		
}
