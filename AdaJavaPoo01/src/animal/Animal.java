package animal;

public abstract class Animal {
			
		protected String nome;
		protected String cor;
		protected int altura;
		protected double peso;
		protected String estadoSpirito;
		
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
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

		public String getEstadoSpirito() {
			return estadoSpirito;
		}

		public void setEstadoSpirito(String estadoSpirito) {
			this.estadoSpirito = estadoSpirito;
		}

		public int getTamanhoDoRabo() {
			return tamanhoDoRabo;
		}

		public void setTamanhoDoRabo(int tamanhoDoRabo) {
			this.tamanhoDoRabo = tamanhoDoRabo;
		}

		public static int getAnimalsGeral() {
			return animalsGeral;
		}

		public static void setAnimalsGeral(int animalsGeral) {
			Animal.animalsGeral = animalsGeral;
		}
		protected int tamanhoDoRabo;
		public static int animalsGeral; 
		
		
		//Constructor
		public Animal(String nome, String cor, int altura, double peso, String estadoSpirit) {
			super();
			this.nome = nome;
			this.cor = cor;
			this.altura = altura;
			this.peso = peso;
			this.estadoSpirito = estadoSpirit;
			animalsGeral++;
		}
		
		protected void comer() {
			
		}
		
		protected void dormir() {
			
		}
		abstract public void soar();
		
}


