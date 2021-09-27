package Cinema;

public class Ingresso(){
    private static int id = 0;
    private double valor;
    private int cadeira;


    public Ingresso(){
        this.id++;
    }

    public Ingresso(double valor,int cadeira){
        this.id++;
        this.valor=valor;
        this.cadeira=cadeira;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id=id;
    }

    public double getValor(){
        return valor;
    }

    public int getCadeira(){
        return cadeira;
    }

    public void setCadeira(){
        this.cadeira = cadeira;
    }

}}