
public class Cachorro {
	//atributos
	private String nome;
	private int idade;
	private float peso;
	private boolean adotado;
	
	//construtores
	public Cachorro() {}
	public Cachorro(String nome) {
		setNome(nome);
	}
	public Cachorro(int idade) {
		setIdade(idade);
	}
	public Cachorro(float peso) {
		setPeso(peso);
	}
	
	public Cachorro(boolean adotado) {
		setAdotado(adotado);
	}
	
	//encapsulamento (getters e setters)
	
	// nome
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/// idade
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//peso
	public float getPeso() {
		return this.peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	//adotado
	public boolean getAdotado() {
		return this.adotado;
	}
	
	public void setAdotado(boolean adotado) {
		this.adotado = adotado;
	}
	
	//Outros metodos
	public float alimentarCachorro(float quantidade) {
		
		float engordou;
		engordou = (quantidade*10)/100;
		return (getPeso() + engordou);
	}
	
	public float exercitarCachorro(int distancia) {
		
		float emagreceu = (distancia*5)/100;
		return (getPeso() - emagreceu);
	}
}
