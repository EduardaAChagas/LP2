
public class Disciplina {

	private int codigo;
	private String nome;
	private int CH;
	private Disciplina pre_requisito;
	
	public Disciplina() {}
	public Disciplina(int codigo, String nome, int CH) {
		this.codigo = codigo;
		this.nome = nome;
		this.CH = CH;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCH() {
		return CH;
	}
	public void setCH(int cH) {
		CH = cH;
	}
	public Disciplina getPre_requisito() {
		return pre_requisito;
	}
	public void setPre_requisito(Disciplina pre_requisito) {
		this.pre_requisito = pre_requisito;
	}
	
}
