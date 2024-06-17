package animal;

public class Dogs extends Animal{

	
	//Constructors
	public Dogs(String nome, String cor, int altura, double peso, String estadoSpirit) {
		super(nome, cor, altura, peso, estadoSpirit);
	}
	
	public String getNome() {
		return this.nome;	
	}
	public void setNome(String x) {
		this.nome = x;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getTamanhoDoRabo() {
		return tamanhoDoRabo;
	}
	public void setTamanhoDoRabo(int tamanhoDoRabo) {
		this.tamanhoDoRabo = tamanhoDoRabo;
	}
	public String getEstadoSpirito() {
		return estadoSpirito;
	}
	public void setEstadoSpirito(String estadoSpirito) {
		this.estadoSpirito = estadoSpirito;
	}
	
	//Methods
	public String interact(String action) {
		switch(action.toLowerCase()) {
			case "carinho":
				this.estadoSpirito = "feliz";
				break;
			case "soco":
				this.estadoSpirito = "bravo";
				break;
			default:
				this.estadoSpirito = "neutro";	
		}
		return estadoSpirito;
			
	}

	@Override
	public String toString() {
		return "Dogs [nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso + ", tamanhoDoRabo="
				+ tamanhoDoRabo + ", estadoSpirito=" + estadoSpirito + "]";
	}

	@Override
	public void soar() {
		System.out.println("Au Au");
		
	}
	
		
}
