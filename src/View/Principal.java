package View;

import Controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		
		 FatorialController fatC = new FatorialController();

		 int multiplicador = 4;
		 int fatorial = 5 ; 
		 int fat = fatC.fat(fatorial,multiplicador);
		 
		 System.out.println(fat);
		 
		 
	}


}
