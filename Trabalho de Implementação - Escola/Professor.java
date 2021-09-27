
public class Professor {

	private long matricula;
	private String nome;
	private String areaFormacao;
	
	public Professor() {}
	public Professor(long matricula, String nome, String areaFormacao) {
		this.matricula = matricula;
		this.nome = nome;
		this.areaFormacao = areaFormacao;
	}
		
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAreaFormacao() {
		return areaFormacao;
	}
	public void setAreaFormacao(String areaFormacao) {
		this.areaFormacao = areaFormacao;
	}
	
}
