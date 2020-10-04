import java.util.Scanner;

public class Teclado {
	private static Scanner input = new Scanner(System.in);
	
	public int LerInteiro() {
    	while(!input.hasNextInt()) {
    		System.err.println(input.next() + " nao e valido!");
    		System.out.println("Digite um inteiro: ");
    	}
    	return input.nextInt();


	}
}
