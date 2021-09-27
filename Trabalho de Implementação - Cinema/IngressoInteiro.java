package Cinema;


public class IngressoInteiro extends Ingresso(){
    private double valor;
    private int cadeira;

    public class IngressoInteiro(double valor,int cadeira){
        super(valor/2,cadeira);
    }
}
