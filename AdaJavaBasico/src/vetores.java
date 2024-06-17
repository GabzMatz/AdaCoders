import java.util.Arrays;

public class vetores {

	
	public static void main(String[] args) {
//		int[] numeros = new int[30];
		
		String[] nomes = {"Gabriel", "Felipe", "Joao", "Felix"};
		
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.print(nomes[i]+ " ");
		}
		
		System.out.println(Arrays.toString(nomes));

	}
	
	
	
}
