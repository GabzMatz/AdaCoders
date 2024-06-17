import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class aula_datas {

	
	public static void main(String args[]) {
		
		String nome = "Gabriel";

		
		Locale brasil = new Locale("pt", "BR");
		System.out.println(LocalDate.now());
		
		System.out.println(LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		String diaSemana = LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		String saudacao;
		if(agora.getHour() >= 0 && agora.getHour() < 12) {
			saudacao = "Bom dia!!";
		}else if(agora.getHour() >= 12 && agora.getHour() < 18 ) {
			saudacao = "Boa Tarde!!";
		}else if(agora.getHour() >= 18 && agora.getHour() < 24 ) {
			saudacao = "Boa noite!!";
		}
		else {
			saudacao = "Ola";
		}
		
		System.out.printf("Ola, %s. hoje é %s, %s .%n", nome, diaSemana, saudacao.toUpperCase());
	
		
		
		
	}
	
	
}