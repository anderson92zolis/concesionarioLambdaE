package concesionario;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Coche mycoche1= new Coche("Mazda","SeriePrime", 4, 400);
			Coche mycoche2= new Coche("Ford","Azr", 4, 600);
			Coche mycoche3= new Coche("Mazda","4X4HIBRID", 3, 88);
			Coche mycoche4= new Coche("TESLA","4X4HIBRID", 1, 200);
			
			ArrayList<Coche> arrayListCoche= new ArrayList<Coche>();
			arrayListCoche.add(mycoche1);
			arrayListCoche.add(mycoche2);
			arrayListCoche.add(mycoche3);
			arrayListCoche.add(mycoche4);
			
			
			System.out.println("1.-Coches de más de 100 cv de potencia: ");
	// 1.-Coches de más de 100 cv de potencia:
			cocheDeMas100cv(arrayListCoche);
			
			System.out.println("\n"+"2.-Coches de una marca y modelo: ");
	//2.-Coches de una marca y modelo:		
			cocheMarcaModelo(arrayListCoche);
			
			System.out.println("\n"+"3.-Media de los caballos de todos los coches: ");
	//3.-Media de los caballos de todos los coches:
			mediaCaballoCoches(arrayListCoche);
			
			System.out.println("\n"+"4.-Cantidad de coches de una marca en concreto:");
	//4.-Cantidad de coches de una marca en concreto:
			System.out.println("Existe "+cantidadMarcaCochesConcreto(arrayListCoche)+ " con la misma marca");
	
			System.out.println("\n"+"5.-Todos los coches diferentes de una marca:");
	//5.-Todos los coches diferentes de una marca:
			todosCocheDiferenteMarca(arrayListCoche);
	}
	
	public static void cocheDeMas100cv(ArrayList<Coche> arrayListCoche) {
		arrayListCoche.stream()
		.filter(carObj-> carObj.getPotencia()>= 100)
		.forEach(System.out::println); // Method References
	}
	
	public static void cocheMarcaModelo(ArrayList<Coche> arrayListCoche) {
		arrayListCoche.stream()
		.filter(carObj->carObj.getMarca().equalsIgnoreCase("Mazda") && carObj.getModelo().equalsIgnoreCase("SeriePrime"))
		.forEach(System.out::println);
	}
	
	public static void mediaCaballoCoches(ArrayList<Coche> arrayListCoche) {
		double average=  arrayListCoche.stream()
		.mapToInt( carObj-> carObj.getPotencia())
		.average()
		.getAsDouble();
		System.out.println("La media es: " + average);
		}
	
	public static double cantidadMarcaCochesConcreto(ArrayList<Coche> arrayListCoche) {
		double count = (double)arrayListCoche.stream()
		.filter(carObj->carObj.getMarca().equalsIgnoreCase("MAZDA"))
		.count();
		
		return count ;
		}
	
	public static void todosCocheDiferenteMarca(ArrayList<Coche> arrayListCoche) {
		arrayListCoche.stream()
		.filter(carObj->!carObj.getMarca().equalsIgnoreCase("MAZDA"))
		.forEach(carObj->System.out.println(carObj.getMarca()));

		}
	
	
}
