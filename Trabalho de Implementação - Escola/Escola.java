import java.util.ArrayList;
import java.util.Iterator;



public class Escola {
	
	public static ArrayList<Turma> turmas = new ArrayList<Turma>();
	
	public static void main(String[] args) {
		int menu;
		
		do {
			System.out.println("### --- Sistema Escola --- ###");
			System.out.println("1. Cadastrar Turma");
			System.out.println("2. Exibir Turma");
			System.out.println("3. Alterar Turma");
			System.out.println("4. Sair");
			
			menu = Teclado.LerInteiro("Selecione um menu");
			
			switch(menu) {
			case 1:
				turmas.add(cadastrarTurma());
				break;
			case 2:
				exibirTurma();
				break;	
			case 3:
				alterarTurma();
				break;	
			default:
				System.err.println("Menu Invalido!");
				break;
			}
		}while(menu!=4);

	}
	
	public static Turma cadastrarTurma() {
		Disciplina disciplina = new Disciplina(Teclado.LerInteiro("Codigo da Disciplina"), Teclado.LerString("Nome da Disciplina"), Teclado.LerInteiro("CH da Disciplina"));
		Professor professor = new Professor(Teclado.LerLong("Matricula do Professor"),Teclado.LerString("Nome do Professor"),Teclado.LerString("Area de Formacao"));
		Turma turma = new Turma(disciplina, professor);
		
		boolean addNovo = true;
		do {
			System.out.println("Cadastro de alunos:");
			Aluno aluno = new Aluno(Teclado.LerLong("Matricula"), Teclado.LerString("Nome"));
			turma.addAluno(aluno);
			addNovo = Teclado.LerBoolean("Cadastrar novo aluno? (true/false)");
		}while(addNovo);
		
		return turma;
	}
	public static void exibirTurma() {
		Iterator it = turmas.iterator();
		while(it.hasNext()) {
			Turma aux = (Turma)it.next();
			System.out.println(aux.getDisciplina().getCodigo() + " - " + aux.getDisciplina().getNome() + " (" + aux.getDisciplina().getCH()+ ")");
			System.out.println("Professor: " + aux.getProfessor().getNome());
			System.out.println("Alunos:");
			Iterator itAlunos = aux.getAlunos().keySet().iterator();
			while(itAlunos.hasNext()) {
				Aluno auxAluno = (Aluno)itAlunos.next();
				System.out.println(auxAluno.getMatricula() + " - " + auxAluno.getNome());
			}
		}		
	}
	public static void alterarTurma() {
		Iterator it = turmas.iterator();
		while(it.hasNext()) {		
			Turma aux = (Turma)it.next();
			System.out.println("Adicionar Notas aos Alunos.");
			System.out.println(aux.getDisciplina().getCodigo() + " - " + aux.getDisciplina().getNome() + " (" + aux.getDisciplina().getCH()+ ")");
			System.out.println("Professor: " + aux.getProfessor().getNome());
			System.out.println("Alunos:");			
			Iterator itAlunos = aux.getAlunos().keySet().iterator();
			while(itAlunos.hasNext()) {
				Aluno auxAluno = (Aluno)itAlunos.next();
				System.out.println(auxAluno.getMatricula() + " - " + auxAluno.getNome());
				float notas[] = {Teclado.LerFloat("Nota1"), Teclado.LerFloat("Nota2"), Teclado.LerFloat("Nota3")};
				aux.getAlunos().put(auxAluno, notas);
			}
		}
	}

}
