import java.util.HashMap;

public class Turma {

	private static int geradorCodigo = 1;
	private int codigo;
	private Disciplina disciplina;
	private Professor professor;
	private HashMap<Aluno, float[]> alunos;
	
	public Turma(){
		this.codigo = this.geradorCodigo;
		this.alunos = new HashMap<Aluno, float[]>();
		this.geradorCodigo++;
	}
	public Turma(Disciplina disciplina, Professor professor){
		this.codigo = this.geradorCodigo;
		this.disciplina = disciplina;
		this.professor = professor;
		this.alunos = new HashMap<Aluno, float[]>();
		this.geradorCodigo++;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public HashMap<Aluno, float[]> getAlunos() {
		return alunos;
	}
	public void setAlunos(HashMap<Aluno, float[]> alunos) {
		this.alunos = alunos;
	}
	public void addAluno(Aluno aluno) {
		float notas[] = {0.0f, 0.0f, 0.0f};
		this.alunos.put(aluno, notas);
	}
	public void lancarNotar(Aluno aluno, float notas[]) {
		if(this.alunos.containsKey(aluno)) 
			this.alunos.put(aluno, notas);
		else
			System.err.println("O aluno nao pertence a turma.");
	}
		
}
