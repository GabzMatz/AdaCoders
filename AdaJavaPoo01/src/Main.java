import animal.Dogs;
import lojas.Petshop;
import animal.Birds;
import animal.Cats;
import animal.Animal;



public class Main {
	
	public static void main(String[] args) {

		Cats gatito1 = new Cats("Amanda", "Preta", 160, 2, null);
		Animal gatito2 = new Cats("Amanda", "Preta", 160, 2, null);
		Animal gatito3 = new Cats("Amanda", "Preta", 160, 2, null);
		
		
		System.out.println(gatito2);
		System.out.println(gatito3);
		
		gatito1.soar();
	}
}