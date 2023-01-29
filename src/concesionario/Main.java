package concesionario;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			Coche mycoche1= new Coche("Mazda","SeriePrime", 4, 400);
			Coche mycoche2= new Coche("Ford","Azr", 4, 600);
			Coche mycoche3= new Coche("Mazda","4X4HIBRID", 3, 88);
			
			ArrayList<Coche> arrayListCoche= new ArrayList<Coche>();
			arrayListCoche.add(mycoche1);
			arrayListCoche.add(mycoche2);
			arrayListCoche.add(mycoche3);
	
	// 1.-Coches de más de 100 cv de potencia:
			cocheDeMas100cv(arrayListCoche);
			
	//2.-Coches de una marca y modelo:		
	
	}
	
	public static void cocheDeMas100cv(ArrayList<Coche> arrayListCoche) {
		arrayListCoche.stream()
		.filter(p-> p.getPotencia()>=100)
		.forEach(System.out::println); // Method References
		}
	
	
	
}
