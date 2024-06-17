package animal;

public class Cats extends Animal {

	
	public Cats(String nome, String cor, int altura, double peso, String estadoSpirit) {
		super(nome, cor, altura, peso, estadoSpirit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cats [nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso + ", estadoSpirito="
				+ estadoSpirito + ", tamanhoDoRabo=" + tamanhoDoRabo +"]";
	}

	@Override
	public void soar() {
		System.out.println("Miau Miau");
	}
	
	
	}
