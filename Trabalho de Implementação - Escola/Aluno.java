
public class Aluno {

	private long matricula;
	private String nome;
	
	public Aluno(long matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	public Aluno() {};
	
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
	
}
