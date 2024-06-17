import java.util.Arrays;
import java.util.Scanner;
public class funcao {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] notas = new double[5];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite sua nota");
			notas[i] = input.nextDouble();
		}
		System.out.println(Arrays.toString(maiorNota(notas)));
		input.close();
	}
	public static double[] maiorNota(double[] numero) {
		double maiorNumero = numero[0];
		double menorNumero = numero[0];
		
		for(int i = 0; i < numero.length; i++) {
			if(numero[i] > maiorNumero) {
				maiorNumero = numero[i];
			}
			if(numero[i] < menorNumero) {
				menorNumero = numero[i];
			}
			
		}
		double[] vetor = {maiorNumero, menorNumero};
		
		
		return vetor;
		
		
	}
	
	
	
}
