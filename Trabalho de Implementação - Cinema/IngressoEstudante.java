package Cinema;

public class IngressoEstudante extends Ingresso(){
    private double valor;
    private int cadeira;

    public IngressoEstudante(douvle valor, int cadeira){
        super(valor/2,cadeira);
    }
}