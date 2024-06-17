package animal;

public class Birds extends Animal {
	
	public Birds(String nome, String cor, int altura, double peso, String estadoSpirit) {
		super(nome, cor, altura, peso, estadoSpirit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Birds [nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso + ", estadoSpirito="
				+ estadoSpirito + ", tamanhoDoRabo=" + tamanhoDoRabo +"]";
	}

	@Override
	public void soar() {
		System.out.println("Piu Piu");
		
	}
	
	
	
	
}
