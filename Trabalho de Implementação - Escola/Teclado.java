import java.util.Scanner;

public class Teclado {
	private static Scanner input = new Scanner(System.in);
	
	public static String LerString(String variavel) {
		System.out.print(variavel+": ");
    	return input.next();
    }
	
    public static int LerInteiro(String variavel) {
    	System.out.print(variavel+": ");
    	while(!input.hasNextInt()) {
    		System.err.println(input.next() + " nao e valido!");
    		System.out.println("Digite um inteiro: ");
    	}
    	return input.nextInt();
    }	
    
    public static boolean LerBoolean(String variavel) {
    	System.out.print(variavel+": ");
    	while(!input.hasNextBoolean()) {
    		System.err.println(input.next() + " nao e valido!");
    		System.out.println("Digite um boolean: ");
    	}
    	return input.nextBoolean();
    }	    

    public static float LerFloat(String variavel) {
    	System.out.print(variavel+": ");
    	while(!input.hasNextFloat()) {
    		System.err.println(input.next() + " nao e valido!");
    		System.out.println("Digite um float: ");
    	}
    	return input.nextFloat();
    }

    public static double LerDouble(String variavel) {
    	System.out.print(variavel+": ");
    	while(!input.hasNextDouble()) {
    		System.err.println(input.next() + " nao e valido!");
    		System.out.println("Digite um float: ");
    	}
    	return input.nextDouble();
    }

    public static long LerLong(String variavel) {
    	System.out.print(variavel+": ");
    	while(!input.hasNextLong()) {
    		System.err.println(input.next() + " nao e valido!");
    		System.out.println("Digite um float: ");
    	}
    	return input.nextLong();
    }

}
