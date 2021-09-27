public class Candidato{
    private String inscricao;
    private String nome;
    private int idade;
    private int nota;

    //metodo construtor vazio
    public Candidato (){}

    //construtor
    public Candidato(String inscricao,String nome, int idade, int nota){
        this.setInscricao(inscricao);
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNota(int nota){
        this.nota = nota;
    }

    public String getInscricao(){
        return inscricao;
    }

    public void setInscricao(String inscricao){
        this.inscricao = inscricao;
    }
}