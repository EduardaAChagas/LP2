import java.util.Scanner;

public class Teclado {
	private static Scanner input = new Scanner(System.in);
	
	public String LerString() {
    	return input.next();
    }
	
	public int LerInteiro() {
    	while(!input.hasNextInt()) {
    		System.err.println(input.next() + " nao e valido!");
    		System.out.println("Digite um inteiro: ");
    	}
    	return input.nextInt();
	}
	
	public float LerFloat() {
    	while(!input.hasNextFloat()) {
    		System.err.println(input.next() + " nao e valido!");
    		System.out.println("Digite um float: ");
    	}
    	return input.nextFloat();
    }
}
