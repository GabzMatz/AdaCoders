package lojas;
import animal.Animal;
import animal.Dogs;

public class Petshop {

	
	public void darBanho(Animal animal) {
		animal.setEstadoSpirito("Limpo");
		
	}
	public void tosar(Dogs cachorro) {
		cachorro.setEstadoSpirito("Tosado");
		
	}
	public void deixarHotel(Animal animal) {
		animal.setEstadoSpirito("Saudades");
	}
	
	
}
