package Cinema;
import java.util.Scanner;

public class Teclado{
    private Scanner input = new Scanner(System.in);
    private int exemplo;
    private int teste;

    public String LerString(){
        return input.next();
    }

    public int LerInteiro(){
        while(!input.hasNextInt()){
            System.err.println(input.next()+" nao eh valido");
            System.out.println("Digite um inteiro: ");
        }
    }

    public int LerDouble(){
        while(!input.hasNextInt()){
            System.err.println(input.next()+" nao eh valido");
            System.out.println("Digite um Double: ");
        }
    }    
    
    public int LerFLoat(){
        while(!input.hasNextInt()){
            System.err.println(input.next()+" nao eh valido");
            System.out.println("Digite um FLoat: ");
        }
    }    
    
    public int LerLong(){
        while(!input.hasNextInt()){
            System.err.println(input.next()+" nao eh valido");
            System.out.println("Digite um Long: ");
        }
    }

    public int getTeste(){
        return teste;
    }

    public void setTeste(){
        this.teste=teste;
    }

    public int getExemplo(){
        return exemplo;
    }

    public void setTeste(){
        this.teste=teste;
    }
}